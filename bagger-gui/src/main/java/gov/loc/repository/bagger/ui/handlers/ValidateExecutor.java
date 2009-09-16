
package gov.loc.repository.bagger.ui.handlers;

import gov.loc.repository.bagger.bag.impl.DefaultBag;
import gov.loc.repository.bagger.ui.BagView;
import gov.loc.repository.bagger.ui.NewBagFrame;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.richclient.command.support.AbstractActionCommandExecutor;

public class ValidateExecutor extends AbstractActionCommandExecutor {
	private static final Log log = LogFactory.getLog(ValidateExecutor.class);
   	private static final long serialVersionUID = 1L;
	BagView bagView;
	DefaultBag bag;

	public ValidateExecutor(BagView bagView) {
		super();
		this.bagView = bagView;
	}

	public void execute() {
		bagView.validateBagHandler.validateBag();
	}

}
