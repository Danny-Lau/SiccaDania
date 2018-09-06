package siccaDania.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class StartScreen extends Composite {

	private static StartScreenUiBinder uiBinder = GWT.create(StartScreenUiBinder.class);

	interface StartScreenUiBinder extends UiBinder<Widget, StartScreen> {
	}

	public StartScreen() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
