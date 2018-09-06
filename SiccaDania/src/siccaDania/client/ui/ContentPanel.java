package siccaDania.client.ui;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DeckLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

public class ContentPanel extends Composite{
	
	 /**
     * Hovedpanelet i klassen
     */
    private DeckLayoutPanel contentPanel;
    
    private StartScreen startScreen;

    
    public ContentPanel() {
    	contentPanel = new DeckLayoutPanel();
    	
    	startScreen = new StartScreen();
    	contentPanel.add(startScreen);
    	
    	
    	
    	
    	//Det panel som vises npr programmet startes
    	contentPanel.showWidget(startScreen);
    	
    	initWidget(contentPanel);
    }
    
    //Denne metode benyttes til at ender View'et
    public void changeView(Widget panel) {
    	contentPanel.showWidget(panel);
    }
    
    //Getter der henter de forskelige hoved-paneller.
    
    public StartScreen getStartScreen() {
    	return startScreen;
    }
    
  
}
