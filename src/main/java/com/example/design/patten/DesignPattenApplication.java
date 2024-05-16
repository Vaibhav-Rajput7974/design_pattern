package com.example.design.patten;

import com.example.design.patten.adapterDesignPattern.CompanyService;
import com.example.design.patten.adapterDesignPattern.FiegnClient;
import com.example.design.patten.adapterDesignPattern.WebClient;
import com.example.design.patten.command.AddCustomerCommand;
import com.example.design.patten.command.CustomerService;
import com.example.design.patten.command.fx.Button;
import com.example.design.patten.command.fx.Command;
import com.example.design.patten.decoratorPatten.CloudStream;
import com.example.design.patten.decoratorPatten.CloudStreamInterface;
import com.example.design.patten.decoratorPatten.Compressor;
import com.example.design.patten.decoratorPatten.Encrypt;
import com.example.design.patten.momento.History;
import com.example.design.patten.momento.Notes;
import com.example.design.patten.statePatten.BrushTool;
import com.example.design.patten.statePatten.Canvas;
import com.example.design.patten.stratagePatten.BlackAndWhite;
import com.example.design.patten.stratagePatten.ImageStorage;
import com.example.design.patten.stratagePatten.JpgCompresor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPattenApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DesignPattenApplication.class, args);
//		DesignPattenApplication.stateDesignPatten();
//		stratagePatten();
//		commandPatten();
//		decoratorPatten();
		adapterDesignPattern();
	}

	public static void momentoDesignPatten(){

		Notes notes = new Notes();
		History history = new History();
		notes.setContext("a");
		history.push(notes.createState());
		notes.setContext(" b ");
		history.push(notes.createState());
		notes.setContext(" c ");
		notes.restore(history.pop());
		notes.restore(history.pop());
		System.out.println(notes.getContext());
	}

	public static void stateDesignPatten() {
		Canvas canvas = new Canvas();
		canvas.setTool(new BrushTool());
		canvas.mouseUp();
		canvas.mouseDown();
	}

	public static void stratagePatten(){
		ImageStorage storage = new ImageStorage(new JpgCompresor(),new BlackAndWhite());
		storage.store("Download");
	}

	public static void commandPatten(){
		Button button  = new Button(new AddCustomerCommand(new CustomerService()));
		button.click();
	}

	public static void decoratorPatten(){

		CloudStreamInterface cloudStreamInterface = new Encrypt(new Compressor(new CloudStream()));
		cloudStreamInterface.write("hiii");
	}

	public static void adapterDesignPattern(){
		WebClient webClient = new WebClient();
		FiegnClient fiegnClient = new FiegnClient();

		CompanyService companyService = new CompanyService(fiegnClient);
		companyService.createCompany();
	}

}
