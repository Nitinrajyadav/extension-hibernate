package org.lucee.extension.orm.hibernate.event;

import org.hibernate.event.spi.PreDeleteEvent;
import org.hibernate.event.spi.PreDeleteEventListener;
import org.lucee.extension.orm.hibernate.CommonUtil;

import lucee.runtime.Component;

public class PreDeleteEventListenerImpl extends EventListener implements PreDeleteEventListener {

	private static final long serialVersionUID = 1730085093470940646L;

	public PreDeleteEventListenerImpl(Component component) {
		super(component, CommonUtil.PRE_DELETE, false);
	}

	@Override
	public boolean onPreDelete(PreDeleteEvent event) {
		invoke(CommonUtil.PRE_DELETE, event.getEntity());
		return false;
	}

}
