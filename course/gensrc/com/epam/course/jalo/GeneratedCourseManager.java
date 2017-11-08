/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 8, 2017 1:10:23 PM                      ---
 * ----------------------------------------------------------------
 */
package com.epam.course.jalo;

import com.epam.course.constants.CourseConstants;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>CourseManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCourseManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("loyaltyCardNumber", AttributeMode.INITIAL);
		tmp.put("marketingComments", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	@Override
	public String getName()
	{
		return CourseConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.loyaltyCardNumber</code> attribute.
	 * @return the loyaltyCardNumber
	 */
	public String getLoyaltyCardNumber(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, CourseConstants.Attributes.Customer.LOYALTYCARDNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.loyaltyCardNumber</code> attribute.
	 * @return the loyaltyCardNumber
	 */
	public String getLoyaltyCardNumber(final Customer item)
	{
		return getLoyaltyCardNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.loyaltyCardNumber</code> attribute. 
	 * @param value the loyaltyCardNumber
	 */
	public void setLoyaltyCardNumber(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, CourseConstants.Attributes.Customer.LOYALTYCARDNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.loyaltyCardNumber</code> attribute. 
	 * @param value the loyaltyCardNumber
	 */
	public void setLoyaltyCardNumber(final Customer item, final String value)
	{
		setLoyaltyCardNumber( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.marketingComments</code> attribute.
	 * @return the marketingComments
	 */
	public String getMarketingComments(final SessionContext ctx, final Customer item)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCustomer.getMarketingComments requires a session language", 0 );
		}
		return (String)item.getLocalizedProperty( ctx, CourseConstants.Attributes.Customer.MARKETINGCOMMENTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.marketingComments</code> attribute.
	 * @return the marketingComments
	 */
	public String getMarketingComments(final Customer item)
	{
		return getMarketingComments( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.marketingComments</code> attribute. 
	 * @return the localized marketingComments
	 */
	public Map<Language,String> getAllMarketingComments(final SessionContext ctx, final Customer item)
	{
		return (Map<Language,String>)item.getAllLocalizedProperties(ctx,CourseConstants.Attributes.Customer.MARKETINGCOMMENTS,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.marketingComments</code> attribute. 
	 * @return the localized marketingComments
	 */
	public Map<Language,String> getAllMarketingComments(final Customer item)
	{
		return getAllMarketingComments( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.marketingComments</code> attribute. 
	 * @param value the marketingComments
	 */
	public void setMarketingComments(final SessionContext ctx, final Customer item, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCustomer.setMarketingComments requires a session language", 0 );
		}
		item.setLocalizedProperty(ctx, CourseConstants.Attributes.Customer.MARKETINGCOMMENTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.marketingComments</code> attribute. 
	 * @param value the marketingComments
	 */
	public void setMarketingComments(final Customer item, final String value)
	{
		setMarketingComments( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.marketingComments</code> attribute. 
	 * @param value the marketingComments
	 */
	public void setAllMarketingComments(final SessionContext ctx, final Customer item, final Map<Language,String> value)
	{
		item.setAllLocalizedProperties(ctx,CourseConstants.Attributes.Customer.MARKETINGCOMMENTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.marketingComments</code> attribute. 
	 * @param value the marketingComments
	 */
	public void setAllMarketingComments(final Customer item, final Map<Language,String> value)
	{
		setAllMarketingComments( getSession().getSessionContext(), item, value );
	}
	
}
