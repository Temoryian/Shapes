package org.cvtc.shapes.tests.substitutes;

import org.cvtc.shapes.Dialog;

public class MessageBoxSub implements Dialog {

	@Override
	public int show(String message, String title) {
		return 0x00;
	}
	
}
