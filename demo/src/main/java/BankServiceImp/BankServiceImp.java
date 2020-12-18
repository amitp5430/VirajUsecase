package BankServiceImp;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import BankService.BankService;
import Bankdto.BankDtoRequest;
import aj.org.objectweb.asm.TypeReference;

@Service
public class BankServiceImp implements BankService{
	@Autowired
	Queue queue;
	@Autowired
	JmsTemplate jmstemplate;
	
	public BankDtoRequest convertObjecttoXX(Object o,com.fasterxml.jackson.core.type.TypeReference<BankDtoRequest> ref) {
		ObjectMapper mapper =new ObjectMapper();
		return mapper.convertValue(o, ref);
	}
	
	public String Bank(BankDtoRequest dtorequest) {
		String respo=null;
		
		jmstemplate.convertAndSend(queue, dtorequest);
		respo="Service in process";
				
		return respo;
	}

	

}
