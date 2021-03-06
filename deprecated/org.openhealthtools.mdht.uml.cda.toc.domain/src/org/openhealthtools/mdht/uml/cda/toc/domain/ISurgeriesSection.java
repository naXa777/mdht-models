/*******************************************************************************
 * Copyright (c) 2011, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.toc.domain;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Surgeries Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.domain.ISurgeriesSection#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getSurgeriesSection()
 * @generated
 */
public interface ISurgeriesSection {
	/**
	 * Returns the value of the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDA Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDA Type</em>' reference.
	 * @see #setCDAType(Section)
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getSurgeriesSection_CDAType()
	 * @generated
	 */
	Section getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ISurgeriesSection#getCDAType <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDA Type</em>' reference.
	 * @see #getCDAType()
	 * @generated
	 */
	void setCDAType(Section value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Section::title.
	 * self.title.oclAsType(datatypes::ST)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ST getTitle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Procedures Section SHALL contain exactly one [1..1] title (CONF-425).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ST withTitle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Procedures Section SHALL contain exactly one [1..1] title (CONF-425).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISurgeriesSection setTitle(ST value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Section::text.
	 * self.text.oclAsType(cda::StrucDocText)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	StrucDocText getText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Procedures Section SHALL contain exactly one [1..1] text (CONF-422).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	StrucDocText withText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Procedures Section SHALL contain exactly one [1..1] text (CONF-422).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISurgeriesSection setText(StrucDocText value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::CodedSurgeriesSection::externalReference.
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(domain::ExternalReference))->asSequence()->first().oclAsType(domain::ExternalReference)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IExternalReference getExternalReference();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Coded Surgeries Section SHOULD contain zero or one [0..1] entry, such that Contains exactly one [1..1] External Reference (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.4).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IExternalReference withExternalReference();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Coded Surgeries Section SHOULD contain zero or one [0..1] entry, such that Contains exactly one [1..1] External Reference (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.4).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISurgeriesSection setExternalReference(IExternalReference value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::CodedSurgeriesSection::procedureEntryProcedureActivityProcedure.
	 * self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(domain::ProcedureEntryProcedureActivityProcedure)).oclAsType(domain::ProcedureEntryProcedureActivityProcedure)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IProcedureEntryProcedureActivityProcedure> getProcedureEntryProcedureActivityProcedures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Coded Surgeries Section SHALL contain at least one [1..*] entry, such that Contains exactly one [1..1] Procedure Entry Procedure Activity Procedure (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.19).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProcedureEntryProcedureActivityProcedure addProcedureEntryProcedureActivityProcedure();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Coded Surgeries Section SHALL contain at least one [1..*] entry, such that Contains exactly one [1..1] Procedure Entry Procedure Activity Procedure (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.19).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISurgeriesSection addProcedureEntryProcedureActivityProcedure(IProcedureEntryProcedureActivityProcedure value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hitsp::SurgeriesSection::procedureActivity.
	 * self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(domain::Procedure)).oclAsType(domain::Procedure)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IProcedure> getProcedureActivities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Surgeries Section SHALL contain at least one [1..*] entry (C83-[CT-108-2]), such that Contains exactly one [1..1] Procedure (templateId: 2.16.840.1.113883.3.88.11.83.17).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProcedure addProcedureActivity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Surgeries Section SHALL contain at least one [1..*] entry (C83-[CT-108-2]), such that Contains exactly one [1..1] Procedure (templateId: 2.16.840.1.113883.3.88.11.83.17).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISurgeriesSection addProcedureActivity(IProcedure value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISurgeriesSection init();
} // ISurgeriesSection
