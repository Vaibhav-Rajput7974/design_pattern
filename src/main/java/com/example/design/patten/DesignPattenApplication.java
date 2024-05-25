package com.example.design.patten;

import com.example.design.patten.eCommercePlateform.ECommercePlatformMain;
import com.example.design.patten.practise.adapterDesignPattern.CompanyService;
import com.example.design.patten.practise.adapterDesignPattern.FiegnClient;
import com.example.design.patten.practise.adapterDesignPattern.MediaAdapter;
import com.example.design.patten.practise.adapterDesignPattern.MediaPlayer;
import com.example.design.patten.practise.adapterDesignPattern.WebClient;
import com.example.design.patten.practise.command.AddCustomerCommand;
import com.example.design.patten.practise.command.CustomerService;
import com.example.design.patten.practise.command.TurnOffCommand;
import com.example.design.patten.practise.command.TurnOnCommand;
import com.example.design.patten.practise.command.fx.Button;
import com.example.design.patten.practise.command.fx.Command;
import com.example.design.patten.practise.command.fx.Light;
import com.example.design.patten.practise.command.fx.RemoteControl;
import com.example.design.patten.practise.decoratorPatten.CloudStream;
import com.example.design.patten.practise.decoratorPatten.CloudStreamInterface;
import com.example.design.patten.practise.decoratorPatten.Compressor;
import com.example.design.patten.practise.decoratorPatten.Encrypt;
import com.example.design.patten.practise.momento.Caretaker;
import com.example.design.patten.practise.momento.Character;
import com.example.design.patten.practise.momento.History;
import com.example.design.patten.practise.momento.Notes;
import com.example.design.patten.practise.statePatten.BrushTool;
import com.example.design.patten.practise.statePatten.Canvas;
import com.example.design.patten.practise.statePatten.OutOfStockState;
import com.example.design.patten.practise.statePatten.ProductSelectedState;
import com.example.design.patten.practise.statePatten.ReadyState;
import com.example.design.patten.practise.statePatten.SelectTool;
import com.example.design.patten.practise.statePatten.VendingMachine;
import com.example.design.patten.practise.stratagePatten.BlackAndWhite;
import com.example.design.patten.practise.stratagePatten.ImageStorage;
import com.example.design.patten.practise.stratagePatten.JpgCompresor;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPattenApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DesignPattenApplication.class, args);
//		DesignPattenApplication.stateDesignPatten();
//		stratagePatten();
//		commandPatten();
//		decoratorPatten();
//		adapterDesignPattern1();
		ECommercePlatformMain.main();
	}

	public static void momentoDesignPatten1(){

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

	public static void momentoDesignPatten2(){
		Character character = new Character(0, 0);
		Caretaker caretaker = new Caretaker();
		character.move(3, 4);
		caretaker.push(character.saveToMemento());
		character.move(7, 9);
		System.out.println("Current Position: (" + character.getX() + ", " + character.getY() + ")");
		character.restoreFromMemento(caretaker.pop());
		System.out.println("Restored Position: (" + character.getX() + ", " + character.getY() + ")");
	}


	public static void stateDesignPatten1() {
		Canvas canvas = new Canvas();
		canvas.setTool(new BrushTool());
		canvas.mouseUp();
		canvas.mouseDown();
		canvas.setTool(new SelectTool());
		canvas.mouseUp();
		canvas.mouseDown();
	}

	public static void stateDesignPattern2(){
		VendingMachine vendingMachine = new VendingMachine();
		vendingMachine.setState(new ReadyState());
		vendingMachine.request();
		vendingMachine.setState(new ProductSelectedState());
		vendingMachine.request();
		vendingMachine.setState(new OutOfStockState());
		vendingMachine.request();
	}


	public static void stratagePatten(){
		ImageStorage storage = new ImageStorage(new JpgCompresor(),new BlackAndWhite());
		storage.store("Download");
	}

	public static void commandPatten1(){
		Button button  = new Button(new AddCustomerCommand(new CustomerService()));
		button.click();
	}

	public static void commandPatten2(){
		Light light = new Light();

		Command turnOnCommand = new TurnOnCommand(light);
		Command turnOffCommand = new TurnOffCommand(light);

		RemoteControl remoteControl = new RemoteControl();
		remoteControl.setCommand(turnOnCommand);
		remoteControl.pressButton();
		remoteControl.setCommand(turnOffCommand);
		remoteControl.pressButton();
	}



	public static void decoratorPatten(){

		CloudStreamInterface cloudStreamInterface = new Encrypt(new Compressor(new CloudStream()));
		cloudStreamInterface.write("hiii");
	}

	public static void adapterDesignPattern1(){
		WebClient webClient = new WebClient();
		FiegnClient fiegnClient = new FiegnClient();

		CompanyService companyService = new CompanyService(fiegnClient);
		companyService.createCompany();
	}


	public static void adapterDesignPattern2() {
		MediaPlayer mediaPlayer = new MediaAdapter("vlc");
		mediaPlayer.play("vlc", "song1.vlc");
		mediaPlayer = new MediaAdapter("mp4");
		mediaPlayer.play("mp4", "song2.mp4");
	}
}
