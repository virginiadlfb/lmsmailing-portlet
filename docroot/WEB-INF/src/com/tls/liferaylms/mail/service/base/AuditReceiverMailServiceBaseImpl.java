/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.tls.liferaylms.mail.service.base;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import com.tls.liferaylms.mail.model.AuditReceiverMail;
import com.tls.liferaylms.mail.service.AuditReceiverMailLocalService;
import com.tls.liferaylms.mail.service.AuditReceiverMailService;
import com.tls.liferaylms.mail.service.AuditSendMailsLocalService;
import com.tls.liferaylms.mail.service.AuditSendMailsService;
import com.tls.liferaylms.mail.service.MailJobLocalService;
import com.tls.liferaylms.mail.service.MailTemplateLocalService;
import com.tls.liferaylms.mail.service.MailTemplateService;
import com.tls.liferaylms.mail.service.persistence.AuditReceiverMailPersistence;
import com.tls.liferaylms.mail.service.persistence.AuditSendMailsPersistence;
import com.tls.liferaylms.mail.service.persistence.MailJobPersistence;
import com.tls.liferaylms.mail.service.persistence.MailTemplatePersistence;

import javax.sql.DataSource;

/**
 * The base implementation of the audit receiver mail remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.tls.liferaylms.mail.service.impl.AuditReceiverMailServiceImpl}.
 * </p>
 *
 * @author je03042
 * @see com.tls.liferaylms.mail.service.impl.AuditReceiverMailServiceImpl
 * @see com.tls.liferaylms.mail.service.AuditReceiverMailServiceUtil
 * @generated
 */
public abstract class AuditReceiverMailServiceBaseImpl extends BaseServiceImpl
	implements AuditReceiverMailService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.tls.liferaylms.mail.service.AuditReceiverMailServiceUtil} to access the audit receiver mail remote service.
	 */

	/**
	 * Returns the audit receiver mail local service.
	 *
	 * @return the audit receiver mail local service
	 */
	public AuditReceiverMailLocalService getAuditReceiverMailLocalService() {
		return auditReceiverMailLocalService;
	}

	/**
	 * Sets the audit receiver mail local service.
	 *
	 * @param auditReceiverMailLocalService the audit receiver mail local service
	 */
	public void setAuditReceiverMailLocalService(
		AuditReceiverMailLocalService auditReceiverMailLocalService) {
		this.auditReceiverMailLocalService = auditReceiverMailLocalService;
	}

	/**
	 * Returns the audit receiver mail remote service.
	 *
	 * @return the audit receiver mail remote service
	 */
	public AuditReceiverMailService getAuditReceiverMailService() {
		return auditReceiverMailService;
	}

	/**
	 * Sets the audit receiver mail remote service.
	 *
	 * @param auditReceiverMailService the audit receiver mail remote service
	 */
	public void setAuditReceiverMailService(
		AuditReceiverMailService auditReceiverMailService) {
		this.auditReceiverMailService = auditReceiverMailService;
	}

	/**
	 * Returns the audit receiver mail persistence.
	 *
	 * @return the audit receiver mail persistence
	 */
	public AuditReceiverMailPersistence getAuditReceiverMailPersistence() {
		return auditReceiverMailPersistence;
	}

	/**
	 * Sets the audit receiver mail persistence.
	 *
	 * @param auditReceiverMailPersistence the audit receiver mail persistence
	 */
	public void setAuditReceiverMailPersistence(
		AuditReceiverMailPersistence auditReceiverMailPersistence) {
		this.auditReceiverMailPersistence = auditReceiverMailPersistence;
	}

	/**
	 * Returns the audit send mails local service.
	 *
	 * @return the audit send mails local service
	 */
	public AuditSendMailsLocalService getAuditSendMailsLocalService() {
		return auditSendMailsLocalService;
	}

	/**
	 * Sets the audit send mails local service.
	 *
	 * @param auditSendMailsLocalService the audit send mails local service
	 */
	public void setAuditSendMailsLocalService(
		AuditSendMailsLocalService auditSendMailsLocalService) {
		this.auditSendMailsLocalService = auditSendMailsLocalService;
	}

	/**
	 * Returns the audit send mails remote service.
	 *
	 * @return the audit send mails remote service
	 */
	public AuditSendMailsService getAuditSendMailsService() {
		return auditSendMailsService;
	}

	/**
	 * Sets the audit send mails remote service.
	 *
	 * @param auditSendMailsService the audit send mails remote service
	 */
	public void setAuditSendMailsService(
		AuditSendMailsService auditSendMailsService) {
		this.auditSendMailsService = auditSendMailsService;
	}

	/**
	 * Returns the audit send mails persistence.
	 *
	 * @return the audit send mails persistence
	 */
	public AuditSendMailsPersistence getAuditSendMailsPersistence() {
		return auditSendMailsPersistence;
	}

	/**
	 * Sets the audit send mails persistence.
	 *
	 * @param auditSendMailsPersistence the audit send mails persistence
	 */
	public void setAuditSendMailsPersistence(
		AuditSendMailsPersistence auditSendMailsPersistence) {
		this.auditSendMailsPersistence = auditSendMailsPersistence;
	}

	/**
	 * Returns the mail job local service.
	 *
	 * @return the mail job local service
	 */
	public MailJobLocalService getMailJobLocalService() {
		return mailJobLocalService;
	}

	/**
	 * Sets the mail job local service.
	 *
	 * @param mailJobLocalService the mail job local service
	 */
	public void setMailJobLocalService(MailJobLocalService mailJobLocalService) {
		this.mailJobLocalService = mailJobLocalService;
	}

	/**
	 * Returns the mail job persistence.
	 *
	 * @return the mail job persistence
	 */
	public MailJobPersistence getMailJobPersistence() {
		return mailJobPersistence;
	}

	/**
	 * Sets the mail job persistence.
	 *
	 * @param mailJobPersistence the mail job persistence
	 */
	public void setMailJobPersistence(MailJobPersistence mailJobPersistence) {
		this.mailJobPersistence = mailJobPersistence;
	}

	/**
	 * Returns the mail template local service.
	 *
	 * @return the mail template local service
	 */
	public MailTemplateLocalService getMailTemplateLocalService() {
		return mailTemplateLocalService;
	}

	/**
	 * Sets the mail template local service.
	 *
	 * @param mailTemplateLocalService the mail template local service
	 */
	public void setMailTemplateLocalService(
		MailTemplateLocalService mailTemplateLocalService) {
		this.mailTemplateLocalService = mailTemplateLocalService;
	}

	/**
	 * Returns the mail template remote service.
	 *
	 * @return the mail template remote service
	 */
	public MailTemplateService getMailTemplateService() {
		return mailTemplateService;
	}

	/**
	 * Sets the mail template remote service.
	 *
	 * @param mailTemplateService the mail template remote service
	 */
	public void setMailTemplateService(MailTemplateService mailTemplateService) {
		this.mailTemplateService = mailTemplateService;
	}

	/**
	 * Returns the mail template persistence.
	 *
	 * @return the mail template persistence
	 */
	public MailTemplatePersistence getMailTemplatePersistence() {
		return mailTemplatePersistence;
	}

	/**
	 * Sets the mail template persistence.
	 *
	 * @param mailTemplatePersistence the mail template persistence
	 */
	public void setMailTemplatePersistence(
		MailTemplatePersistence mailTemplatePersistence) {
		this.mailTemplatePersistence = mailTemplatePersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Returns the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
	}

	protected Class<?> getModelClass() {
		return AuditReceiverMail.class;
	}

	protected String getModelClassName() {
		return AuditReceiverMail.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = auditReceiverMailPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = AuditReceiverMailLocalService.class)
	protected AuditReceiverMailLocalService auditReceiverMailLocalService;
	@BeanReference(type = AuditReceiverMailService.class)
	protected AuditReceiverMailService auditReceiverMailService;
	@BeanReference(type = AuditReceiverMailPersistence.class)
	protected AuditReceiverMailPersistence auditReceiverMailPersistence;
	@BeanReference(type = AuditSendMailsLocalService.class)
	protected AuditSendMailsLocalService auditSendMailsLocalService;
	@BeanReference(type = AuditSendMailsService.class)
	protected AuditSendMailsService auditSendMailsService;
	@BeanReference(type = AuditSendMailsPersistence.class)
	protected AuditSendMailsPersistence auditSendMailsPersistence;
	@BeanReference(type = MailJobLocalService.class)
	protected MailJobLocalService mailJobLocalService;
	@BeanReference(type = MailJobPersistence.class)
	protected MailJobPersistence mailJobPersistence;
	@BeanReference(type = MailTemplateLocalService.class)
	protected MailTemplateLocalService mailTemplateLocalService;
	@BeanReference(type = MailTemplateService.class)
	protected MailTemplateService mailTemplateService;
	@BeanReference(type = MailTemplatePersistence.class)
	protected MailTemplatePersistence mailTemplatePersistence;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private AuditReceiverMailServiceClpInvoker _clpInvoker = new AuditReceiverMailServiceClpInvoker();
}