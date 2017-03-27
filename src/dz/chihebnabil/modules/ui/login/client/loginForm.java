package dz.chihebnabil.modules.ui.login.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class loginForm extends Composite {

	private static loginFormUiBinder uiBinder = GWT
			.create(loginFormUiBinder.class);

	interface loginFormUiBinder extends UiBinder<Widget, loginForm> {
	}

	public loginForm() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
