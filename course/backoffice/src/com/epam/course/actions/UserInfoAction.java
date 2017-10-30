package com.epam.course.actions;

import com.hybris.backoffice.widgets.notificationarea.event.NotificationEvent;
import com.hybris.backoffice.widgets.notificationarea.event.NotificationUtils;
import com.hybris.cockpitng.actions.ActionContext;
import com.hybris.cockpitng.actions.ActionResult;
import com.hybris.cockpitng.actions.CockpitAction;

import de.hybris.platform.core.model.user.CustomerModel;

public class UserInfoAction implements CockpitAction<CustomerModel, String> {
    @Override
    public ActionResult<String> perform(ActionContext<CustomerModel> actionContext) {

        NotificationUtils.notifyUser("Hi", NotificationEvent.Type.SUCCESS);

        return new ActionResult<>(ActionResult.SUCCESS);
    }
}
