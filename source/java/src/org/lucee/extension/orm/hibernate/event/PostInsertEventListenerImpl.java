package org.lucee.extension.orm.hibernate.event;

import org.hibernate.event.spi.PostInsertEvent;
import org.hibernate.event.spi.PostInsertEventListener;
import org.hibernate.persister.entity.EntityPersister;
import org.lucee.extension.orm.hibernate.CommonUtil;

import lucee.runtime.Component;

public class PostInsertEventListenerImpl extends EventListener implements PostInsertEventListener {

	private static final long serialVersionUID = -1300488254940330390L;

	public PostInsertEventListenerImpl(Component component) {
		super(component, CommonUtil.POST_INSERT, false);
	}

	@Override
	public void onPostInsert(PostInsertEvent event) {
		invoke(CommonUtil.POST_INSERT, event.getEntity());
	}

	@Override
	public boolean requiresPostCommitHanding(EntityPersister arg0) {
		return false;
	}

}
