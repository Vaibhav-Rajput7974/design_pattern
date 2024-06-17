package com.example.design.patten;

import com.example.design.patten.practise.componentDesignPattern.HumanResourse;
import com.example.design.patten.practise.componentDesignPattern.Team;
import com.example.design.patten.practise.componentDesignPattern.Truck;
import com.example.design.patten.practise.adapterDesignPattern.CompanyService;
import com.example.design.patten.practise.adapterDesignPattern.FiegnClient;
import com.example.design.patten.practise.adapterDesignPattern.MediaAdapter;
import com.example.design.patten.practise.adapterDesignPattern.MediaPlayer;
import com.example.design.patten.practise.adapterDesignPattern.WebClient;
import com.example.design.patten.practise.chainOfResponsibity.Authenticate;
import com.example.design.patten.practise.chainOfResponsibity.HttpRequest;
import com.example.design.patten.practise.chainOfResponsibity.Logger;
import com.example.design.patten.practise.chainOfResponsibity.WebServer;
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
import com.example.design.patten.practise.facade.TwitterService;
import com.example.design.patten.practise.flyWeigtPattern.Sheet;
import com.example.design.patten.practise.flyWeigtPattern.SheetService;
import com.example.design.patten.practise.flyWeigtPattern.StyleFactory;
import com.example.design.patten.practise.iteratorPattern.BroserHistory;
import com.example.design.patten.practise.iteratorPattern.Iterator;
import com.example.design.patten.practise.mediatorPattern.usingmedator.ArticalDialogBox;
import com.example.design.patten.practise.momento.Caretaker;
import com.example.design.patten.practise.momento.Character;
import com.example.design.patten.practise.momento.History;
import com.example.design.patten.practise.momento.Notes;
import com.example.design.patten.practise.observerDesignPattern.example1.ChatBoat;
import com.example.design.patten.practise.observerDesignPattern.example1.DataSource;
import com.example.design.patten.practise.observerDesignPattern.example1.Observer;
import com.example.design.patten.practise.observerDesignPattern.example1.SpreadSheet;
import com.example.design.patten.practise.observerDesignPattern.stocks.Display;
import com.example.design.patten.practise.observerDesignPattern.stocks.StatusBar;
import com.example.design.patten.practise.observerDesignPattern.stocks.StockListView;
import com.example.design.patten.practise.observerDesignPattern.stocks.Stocks;
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
import com.example.design.patten.practise.templateMethodPattern.MoneyTransfer;
import com.example.design.patten.practise.vistorDesignPattern.AncorNode;
import com.example.design.patten.practise.vistorDesignPattern.HeaderNode;
import com.example.design.patten.practise.vistorDesignPattern.HighLight;
import com.example.design.patten.practise.vistorDesignPattern.HtmlDocument;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DesignPattenApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DesignPattenApplication.class, args);
//		DesignPattenApplication.stateDesignPatten();
//		stratagePatten();
//		commandPatten();
//		decoratorPatten();
//		adapterDesignPattern1();
//		vistorPattern();
//		iteratorDesigePattern();
//		templateMethodPattern();
//		medatorPatterUsingObserver();
//		componentDesignPattern();
//		facadePattern();
		flyweightPattern();
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

	public static void observerDesignpattern(){
		DataSource dataSource = new DataSource();
		Observer sheet1 = new SpreadSheet(dataSource);
		Observer chata = new ChatBoat(dataSource);
		dataSource.addObserver(sheet1);
		dataSource.addObserver(chata);
		dataSource.setValue(1);
	}

	public static void observerDesignePatternStocksExample(){
		Stocks stocks = new Stocks();
		Display statusBar = new StatusBar(stocks);
		Display stockListView = new StockListView(stocks);
		stocks.addDisplay(stockListView);
		stocks.addDisplay(statusBar);
		stocks.setPrice(2);
	}

	public static void chainOfResponsibility(){
		var compressior = new com.example.design.patten.practise.chainOfResponsibity.Compressor(null);
		var logger = new Logger(compressior);
		var authenticator = new Authenticate(compressior);
		WebServer server = new WebServer(authenticator);
		server.handel(new HttpRequest("admin","123"));
	}

	public static void vistorPattern(){
		var htmlpattern = new HtmlDocument();
		htmlpattern.add(new AncorNode());
		htmlpattern.add(new HeaderNode());
		htmlpattern.accept(new HighLight());

	}

	public static void iteratorDesigePattern(){
		BroserHistory broserHistory = new BroserHistory();
		broserHistory.push("1");
		broserHistory.push("2");
		broserHistory.push("3");

		Iterator iterator = broserHistory.createItorato();

		while (iterator.hasNext()){
			System.out.println(iterator.current());
			iterator.next();
		}
	}

	public static void templateMethodPattern(){
		MoneyTransfer moneyTransfer = new MoneyTransfer();
		moneyTransfer.exicute();
	}

	public static void mediatorPatternUsingMediator(){
		var dialogBox = new ArticalDialogBox();
		dialogBox.simulateUser();
	}

	public static void medatorPatterUsingObserver(){
		var dialogBox  = new com.example.design.patten.practise.mediatorPattern.usingObserver.ArticalDialogBox();
		dialogBox.simulateUser();
	}

	public static void componentDesignPattern(){
		var team1= new Team();
		team1.add(new HumanResourse());
		team1.add(new HumanResourse());
		team1.add(new Truck());
		var team2 = new Team();
		team2.add(new HumanResourse());
		team2.add(new Truck());
		Team team = new Team();
		team.add(team1);
		team.add(team2);
		team.handel();
	}

	public static void facadePattern(){
		TwitterService twitterService = new TwitterService();
		twitterService.recentTwittes("vaibhav");
		twitterService.likeTwit("vaibhav");
		twitterService.newTwit("vaibhav");
	}

	public static void flyweightPattern(){
		SheetService sheetService = new SheetService(new StyleFactory());
		for (Sheet sheet: sheetService.getSheet()){
			sheet.draw();
		}
	}

}
