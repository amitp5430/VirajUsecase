package BankController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import BankService.BankService;
import Bankdto.BankDtoRequest;

@RestController
public class BankController {
@Autowired
BankService bankservice;
@PostMapping(value="/cutomerdetail", consumes = {"application/json","application/xml}"},produces = {"application/json","application/xml"})
public void add(@RequestBody BankDtoRequest dtoRequest) {
	String msg=null;
	try {
		msg= bankservice.Bank(dtoRequest);
		
	}catch (Exception e) {
		// TODO: handle exception
	}
}

}
