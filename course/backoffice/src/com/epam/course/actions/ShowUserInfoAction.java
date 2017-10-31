package com.epam.course.actions;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.hybris.backoffice.widgets.notificationarea.event.NotificationEvent;
import com.hybris.backoffice.widgets.notificationarea.event.NotificationUtils;
import com.hybris.cockpitng.actions.ActionContext;
import com.hybris.cockpitng.actions.ActionResult;
import com.hybris.cockpitng.actions.CockpitAction;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.order.OrderService;
import de.hybris.platform.order.daos.OrderDao;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.servicelayer.user.daos.UserDao;

public class ShowUserInfoAction implements CockpitAction<CustomerModel, String> {


    @Override
    public ActionResult<String> perform(ActionContext<CustomerModel> actionContext) {

        NotificationUtils.notifyUser("Hi", NotificationEvent.Type.SUCCESS);

        return new ActionResult<>(ActionResult.SUCCESS);
    }
}
