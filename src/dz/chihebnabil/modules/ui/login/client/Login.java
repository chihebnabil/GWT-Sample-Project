package dz.chihebnabil.modules.ui.login.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class Login implements EntryPoint {
	
	private loginForm form = new loginForm();

	@Override
	public void onModuleLoad() {
		// TODO Auto-generated method stub
         RootPanel.get().add(form);
	}

}
