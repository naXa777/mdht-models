/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ihe.Comment;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Comment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Comment#validateIHECommentHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Comment Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Comment#validateIHECommentEffectiveTimeWhenAuthorPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Comment Effective Time When Author Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Comment#validateIHECommentHasAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Comment Has Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Comment#validateIHECommentHasAuthorOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Comment Has Author Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Comment#validateIHECommentStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Comment Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Comment#validateIHECommentText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Comment Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Comment#validateIHECommentAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Comment Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Comment#validateCommentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommentOperations extends org.openhealthtools.mdht.uml.cda.ccd.operations.CommentOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHECommentHasTextReference(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Comment Has Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHECommentHasTextReference(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_COMMENT_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.reference.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateIHECommentHasTextReference(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Comment Has Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHECommentHasTextReference(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_IHE_COMMENT_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param comment The receiving '<em><b>Comment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIHECommentHasTextReference(Comment comment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IHE_COMMENT_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.COMMENT);
			try {
				VALIDATE_IHE_COMMENT_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_IHE_COMMENT_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_IHE_COMMENT_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(comment)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.COMMENT__IHE_COMMENT_HAS_TEXT_REFERENCE,
						IHEPlugin.INSTANCE.getString("CommentIHECommentHasTextReference"), new Object[] { comment }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHECommentEffectiveTimeWhenAuthorPresent(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Comment Effective Time When Author Present</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHECommentEffectiveTimeWhenAuthorPresent(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_COMMENT_EFFECTIVE_TIME_WHEN_AUTHOR_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.author->isEmpty() implies not self.effectiveTime.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateIHECommentEffectiveTimeWhenAuthorPresent(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Comment Effective Time When Author Present</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHECommentEffectiveTimeWhenAuthorPresent(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_IHE_COMMENT_EFFECTIVE_TIME_WHEN_AUTHOR_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param comment The receiving '<em><b>Comment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIHECommentEffectiveTimeWhenAuthorPresent(Comment comment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IHE_COMMENT_EFFECTIVE_TIME_WHEN_AUTHOR_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.COMMENT);
			try {
				VALIDATE_IHE_COMMENT_EFFECTIVE_TIME_WHEN_AUTHOR_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_IHE_COMMENT_EFFECTIVE_TIME_WHEN_AUTHOR_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_IHE_COMMENT_EFFECTIVE_TIME_WHEN_AUTHOR_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				comment)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.COMMENT__IHE_COMMENT_EFFECTIVE_TIME_WHEN_AUTHOR_PRESENT,
						IHEPlugin.INSTANCE.getString("CommentIHECommentEffectiveTimeWhenAuthorPresent"),
						new Object[] { comment }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHECommentHasAuthorId(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Comment Has Author Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHECommentHasAuthorId(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_COMMENT_HAS_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.author->isEmpty() implies (  self.author.assignedAuthor.id ->size() > 0 and self.author.assignedAuthor.addr ->size() > 0 and self.author.assignedAuthor.telecom ->size() > 0)";

	/**
	 * The cached OCL invariant for the '{@link #validateIHECommentHasAuthorId(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Comment Has Author Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHECommentHasAuthorId(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_IHE_COMMENT_HAS_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param comment The receiving '<em><b>Comment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIHECommentHasAuthorId(Comment comment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IHE_COMMENT_HAS_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.COMMENT);
			try {
				VALIDATE_IHE_COMMENT_HAS_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_IHE_COMMENT_HAS_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_IHE_COMMENT_HAS_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			comment)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.COMMENT__IHE_COMMENT_HAS_AUTHOR_ID,
						IHEPlugin.INSTANCE.getString("CommentIHECommentHasAuthorId"), new Object[] { comment }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHECommentHasAuthorOrganization(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Comment Has Author Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHECommentHasAuthorOrganization(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_COMMENT_HAS_AUTHOR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.author->isEmpty() implies ( self.author->exists( a : cda::Author | ( (not a.assignedAuthor.assignedPerson.oclIsUndefined()) and not a.assignedAuthor.assignedPerson.name->isEmpty()) or (not a.assignedAuthor.representedOrganization.name->isEmpty())  ) )";

	/**
	 * The cached OCL invariant for the '{@link #validateIHECommentHasAuthorOrganization(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Comment Has Author Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHECommentHasAuthorOrganization(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_IHE_COMMENT_HAS_AUTHOR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param comment The receiving '<em><b>Comment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIHECommentHasAuthorOrganization(Comment comment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IHE_COMMENT_HAS_AUTHOR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.COMMENT);
			try {
				VALIDATE_IHE_COMMENT_HAS_AUTHOR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_IHE_COMMENT_HAS_AUTHOR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_IHE_COMMENT_HAS_AUTHOR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(comment)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.COMMENT__IHE_COMMENT_HAS_AUTHOR_ORGANIZATION,
						IHEPlugin.INSTANCE.getString("CommentIHECommentHasAuthorOrganization"),
						new Object[] { comment }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHECommentStatusCode(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Comment Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHECommentStatusCode(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_COMMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateIHECommentStatusCode(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Comment Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHECommentStatusCode(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_IHE_COMMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param comment The receiving '<em><b>Comment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIHECommentStatusCode(Comment comment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IHE_COMMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.COMMENT);
			try {
				VALIDATE_IHE_COMMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_IHE_COMMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_IHE_COMMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			comment)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE, IHEValidator.COMMENT__IHE_COMMENT_STATUS_CODE,
						IHEPlugin.INSTANCE.getString("CommentIHECommentStatusCode"), new Object[] { comment }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHECommentText(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Comment Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHECommentText(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_COMMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateIHECommentText(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Comment Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHECommentText(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_IHE_COMMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param comment The receiving '<em><b>Comment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIHECommentText(Comment comment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IHE_COMMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.COMMENT);
			try {
				VALIDATE_IHE_COMMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_IHE_COMMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_IHE_COMMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			comment)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE, IHEValidator.COMMENT__IHE_COMMENT_TEXT,
						IHEPlugin.INSTANCE.getString("CommentIHECommentText"), new Object[] { comment }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHECommentAuthor(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Comment Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHECommentAuthor(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_COMMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(rim::Participation))";

	/**
	 * The cached OCL invariant for the '{@link #validateIHECommentAuthor(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Comment Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHECommentAuthor(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_IHE_COMMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param comment The receiving '<em><b>Comment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIHECommentAuthor(Comment comment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_IHE_COMMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.COMMENT);
			try {
				VALIDATE_IHE_COMMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_IHE_COMMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_IHE_COMMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			comment)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE, IHEValidator.COMMENT__IHE_COMMENT_AUTHOR,
						IHEPlugin.INSTANCE.getString("CommentIHECommentAuthor"), new Object[] { comment }));
			}

			return false;
		}
		return true;
	}

	// ( ((not self.author->isEmpty()) implies ( self.author.assignedAuthor.assignedPerson.name ->size() > 0 )) or ((not self.author->isEmpty())
	// implies ( self.author.assignedAuthor.representedOrganization.name ->size() > 0)) )";
	// not self.author->isEmpty() implies (( (not self.author.assignedAuthor.representedOrganization.name->isEmpty()) or (not
	// self.author.assignedAuthor.assignedPerson.name->isEmpty()) ))";

	/**
	 * The cached OCL expression body for the '{@link #validateCommentTemplateId(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentTemplateId(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateCommentTemplateId(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentTemplateId(Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_COMMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param comment The receiving '<em><b>Comment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCommentTemplateId(Comment comment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COMMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.COMMENT);
			try {
				VALIDATE_COMMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_COMMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_COMMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			comment)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE, IHEValidator.COMMENT__COMMENT_TEMPLATE_ID,
						IHEPlugin.INSTANCE.getString("CommentCommentTemplateId"), new Object[] { comment }));
			}

			return false;
		}
		return true;
	}

} // CommentOperations
