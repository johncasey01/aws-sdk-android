/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.securitytoken;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.securitytoken.model.*;

/**
 * Interface for accessing AWSSecurityTokenService.
 * AWS Security Token Service <p>
 * The AWS Security Token Service (STS) is a web service that enables you
 * to request temporary, limited-privilege credentials for AWS Identity
 * and Access Management (IAM) users or for users that you authenticate
 * (federated users). This guide provides descriptions of the STS API.
 * For more detailed information about using this service, go to
 * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp.html"> Temporary Security Credentials </a>
 * .
 * </p>
 * <p>
 * <b>NOTE:</b> As an alternative to using the API, you can use one of
 * the AWS SDKs, which consist of libraries and sample code for various
 * programming languages and platforms (Java, Ruby, .NET, iOS, Android,
 * etc.). The SDKs provide a convenient way to create programmatic access
 * to STS. For example, the SDKs take care of cryptographically signing
 * requests, managing errors, and retrying requests automatically. For
 * information about the AWS SDKs, including how to download and install
 * them, see the Tools for Amazon Web Services page.
 * </p>
 * <p>
 * For information about setting up signatures and authorization through
 * the API, go to
 * <a href="http://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html"> Signing AWS API Requests </a> in the <i>AWS General Reference</i> . For general information about the Query API, go to <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html"> Making Query Requests </a> in <i>Using IAM</i> . For information about using security tokens with other AWS products, go to <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html"> AWS Services That Work with IAM </a>
 * in the <i>Using IAM</i> .
 * </p>
 * <p>
 * If you're new to AWS and need additional technical information about a
 * specific AWS product, you can find the product's technical
 * documentation at
 * <a href="http://aws.amazon.com/documentation/"> http://aws.amazon.com/documentation/ </a>
 * .
 * </p>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * The AWS Security Token Service (STS) has a default endpoint of
 * https://sts.amazonaws.com that maps to the US East (N. Virginia)
 * region. Additional regions are available, but must first be activated
 * in the AWS Management Console before you can use a different region's
 * endpoint. For more information about activating a region for STS see
 * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"> Activating STS in a New Region </a>
 * in the <i>Using IAM</i> .
 * </p>
 * <p>
 * For information about STS endpoints, see
 * <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#sts_region"> Regions and Endpoints </a>
 * in the <i>AWS General Reference</i> .
 * </p>
 * <p>
 * <b>Recording API requests</b>
 * </p>
 * <p>
 * STS supports AWS CloudTrail, which is a service that records AWS calls
 * for your AWS account and delivers log files to an Amazon S3 bucket. By
 * using information collected by CloudTrail, you can determine what
 * requests were successfully made to STS, who made the request, when it
 * was made, and so on. To learn more about CloudTrail, including how to
 * turn it on and find your log files, see the
 * <a href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html"> AWS CloudTrail User Guide </a>
 * .
 * </p>
 */
public interface AWSSecurityTokenService {

    /**
     * Overrides the default endpoint for this client ("https://sts.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "sts.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://sts.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "sts.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://sts.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSSecurityTokenService#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;
    
    /**
     * <p>
     * Returns a set of temporary credentials for an AWS account or IAM
     * user. The credentials consist of an access key ID, a secret access
     * key, and a security token. Typically, you use
     * <code>GetSessionToken</code> if you want to use MFA to protect
     * programmatic calls to specific AWS APIs like Amazon EC2
     * <code>StopInstances</code> . MFA-enabled IAM users would need to call
     * <code>GetSessionToken</code> and submit an MFA code that is associated
     * with their MFA device. Using the temporary security credentials that
     * are returned from the call, IAM users can then make programmatic calls
     * to APIs that require MFA authentication. If you do not supply a
     * correct MFA code, then the API returns an access denied error.
     * </p>
     * <p>
     * The <code>GetSessionToken</code> action must be called by using the
     * long-term AWS security credentials of the AWS account or an IAM user.
     * Credentials that are created by IAM users are valid for the duration
     * that you specify, between 900 seconds (15 minutes) and 129600 seconds
     * (36 hours); credentials that are created by using account credentials
     * have a maximum duration of 3600 seconds (1 hour).
     * </p>
     * <p>
     * <b>NOTE:</b> We recommend that you do not call GetSessionToken with
     * root account credentials. Instead, follow our best practices by
     * creating one or more IAM users, giving them the necessary permissions,
     * and using IAM users for everyday interaction with AWS.
     * </p>
     * <p>
     * The permissions associated with the temporary security credentials
     * returned by <code>GetSessionToken</code> are based on the permissions
     * associated with account or IAM user whose credentials are used to call
     * the action. If <code>GetSessionToken</code> is called using root
     * account credentials, the temporary credentials have root account
     * permissions. Similarly, if <code>GetSessionToken</code> is called
     * using the credentials of an IAM user, the temporary credentials have
     * the same permissions as the IAM user.
     * </p>
     * <p>
     * For more information about using <code>GetSessionToken</code> to
     * create temporary credentials, go to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_getsessiontoken"> Temporary Credentials for Users in Untrusted Environments </a>
     * in the <i>Using IAM</i> .
     * </p>
     *
     * @param getSessionTokenRequest Container for the necessary parameters
     *           to execute the GetSessionToken service method on
     *           AWSSecurityTokenService.
     * 
     * @return The response from the GetSessionToken service method, as
     *         returned by AWSSecurityTokenService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSecurityTokenService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetSessionTokenResult getSessionToken(GetSessionTokenRequest getSessionTokenRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a set of temporary security credentials for users who have
     * been authenticated in a mobile or web application with a web identity
     * provider, such as Amazon Cognito, Login with Amazon, Facebook, Google,
     * or any OpenID Connect-compatible identity provider.
     * </p>
     * <p>
     * <b>NOTE:</b> For mobile applications, we recommend that you use
     * Amazon Cognito. You can use Amazon Cognito with the AWS SDK for iOS
     * and the AWS SDK for Android to uniquely identify a user and supply the
     * user with a consistent identity throughout the lifetime of an
     * application. To learn more about Amazon Cognito, see Amazon Cognito
     * Overview in the AWS SDK for Android Developer Guide guide and Amazon
     * Cognito Overview in the AWS SDK for iOS Developer Guide.
     * </p>
     * <p>
     * Calling <code>AssumeRoleWithWebIdentity</code> does not require the
     * use of AWS security credentials. Therefore, you can distribute an
     * application (for example, on mobile devices) that requests temporary
     * security credentials without including long-term AWS credentials in
     * the application, and without deploying server-based proxy services
     * that use long-term AWS credentials. Instead, the identity of the
     * caller is validated by using a token from the web identity provider.
     * </p>
     * <p>
     * The temporary security credentials returned by this API consist of an
     * access key ID, a secret access key, and a security token. Applications
     * can use these temporary security credentials to sign calls to AWS
     * service APIs. The credentials are valid for the duration that you
     * specified when calling <code>AssumeRoleWithWebIdentity</code> , which
     * can be from 900 seconds (15 minutes) to 3600 seconds (1 hour). By
     * default, the temporary security credentials are valid for 1 hour.
     * </p>
     * <p>
     * Optionally, you can pass an IAM access policy to this operation. If
     * you choose not to pass a policy, the temporary security credentials
     * that are returned by the operation have the permissions that are
     * defined in the access policy of the role that is being assumed. If you
     * pass a policy to this operation, the temporary security credentials
     * that are returned by the operation have the permissions that are
     * allowed by both the access policy of the role that is being assumed,
     * <i> and </i> the policy that you pass. This gives you a way to further
     * restrict the permissions for the resulting temporary security
     * credentials. You cannot use the passed policy to grant permissions
     * that are in excess of those allowed by the access policy of the role
     * that is being assumed. For more information, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"> Permissions for AssumeRole, AssumeRoleWithSAML, and AssumeRoleWithWebIdentity </a>
     * in the <i>Using IAM</i> .
     * </p>
     * <p>
     * Before your application can call
     * <code>AssumeRoleWithWebIdentity</code> , you must have an identity
     * token from a supported identity provider and create a role that the
     * application can assume. The role that your application assumes must
     * trust the identity provider that is associated with the identity
     * token. In other words, the identity provider must be specified in the
     * role's trust policy.
     * </p>
     * <p>
     * For more information about how to use web identity federation and the
     * <code>AssumeRoleWithWebIdentity</code> API, see the following
     * resources:
     * </p>
     * 
     * <ul>
     * <li>
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc_manual"> Using Web Identity Federation APIs for Mobile Apps </a> and <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_assumerolewithwebidentity"> Federation Through a Web-based Identity Provider </a>
     * . </li>
     * <li>
     * <a href="https://web-identity-federation-playground.s3.amazonaws.com/index.html"> Web Identity Federation Playground </a>
     * . This interactive website lets you walk through the process of
     * authenticating via Login with Amazon, Facebook, or Google, getting
     * temporary security credentials, and then using those credentials to
     * make a request to AWS. </li>
     * <li>
     * <a href="http://aws.amazon.com/sdkforios/"> AWS SDK for iOS </a> and <a href="http://aws.amazon.com/sdkforandroid/"> AWS SDK for Android </a>
     * . These toolkits contain sample apps that show how to invoke the
     * identity providers, and then how to use the information from these
     * providers to get and use temporary security credentials. </li>
     * <li>
     * <a href="http://aws.amazon.com/articles/4617974389850313"> Web Identity Federation with Mobile Applications </a>
     * . This article discusses web identity federation and shows an example
     * of how to use web identity federation to get access to content in
     * Amazon S3. </li>
     * 
     * </ul>
     *
     * @param assumeRoleWithWebIdentityRequest Container for the necessary
     *           parameters to execute the AssumeRoleWithWebIdentity service method on
     *           AWSSecurityTokenService.
     * 
     * @return The response from the AssumeRoleWithWebIdentity service
     *         method, as returned by AWSSecurityTokenService.
     * 
     * @throws PackedPolicyTooLargeException
     * @throws IDPRejectedClaimException
     * @throws MalformedPolicyDocumentException
     * @throws InvalidIdentityTokenException
     * @throws ExpiredTokenException
     * @throws IDPCommunicationErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSecurityTokenService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AssumeRoleWithWebIdentityResult assumeRoleWithWebIdentity(AssumeRoleWithWebIdentityRequest assumeRoleWithWebIdentityRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a set of temporary security credentials (consisting of an
     * access key ID, a secret access key, and a security token) for a
     * federated user. A typical use is in a proxy application that gets
     * temporary security credentials on behalf of distributed applications
     * inside a corporate network. Because you must call the
     * <code>GetFederationToken</code> action using the long-term security
     * credentials of an IAM user, this call is appropriate in contexts where
     * those credentials can be safely stored, usually in a server-based
     * application.
     * </p>
     * <p>
     * <b>NOTE:</b> If you are creating a mobile-based or browser-based app
     * that can authenticate users using a web identity provider like Login
     * with Amazon, Facebook, Google, or an OpenID Connect-compatible
     * identity provider, we recommend that you use Amazon Cognito or
     * AssumeRoleWithWebIdentity. For more information, see Federation
     * Through a Web-based Identity Provider.
     * </p>
     * <p>
     * The <code>GetFederationToken</code> action must be called by using
     * the long-term AWS security credentials of an IAM user. You can also
     * call <code>GetFederationToken</code> using the security credentials of
     * an AWS account (root), but this is not recommended. Instead, we
     * recommend that you create an IAM user for the purpose of the proxy
     * application and then attach a policy to the IAM user that limits
     * federated users to only the actions and resources they need access to.
     * For more information, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html"> IAM Best Practices </a>
     * in the <i>Using IAM</i> .
     * </p>
     * <p>
     * The temporary security credentials that are obtained by using the
     * long-term credentials of an IAM user are valid for the specified
     * duration, between 900 seconds (15 minutes) and 129600 seconds (36
     * hours). Temporary credentials that are obtained by using AWS account
     * (root) credentials have a maximum duration of 3600 seconds (1 hour)
     * </p>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * The permissions for the temporary security credentials returned by
     * <code>GetFederationToken</code> are determined by a combination of the
     * following:
     * </p>
     * 
     * <ul>
     * <li>The policy or policies that are attached to the IAM user whose
     * credentials are used to call <code>GetFederationToken</code> .</li>
     * <li>The policy that is passed as a parameter in the call.</li>
     * 
     * </ul>
     * <p>
     * The passed policy is attached to the temporary security credentials
     * that result from the <code>GetFederationToken</code> API call--that
     * is, to the <i>federated user</i> . When the federated user makes an
     * AWS request, AWS evaluates the policy attached to the federated user
     * in combination with the policy or policies attached to the IAM user
     * whose credentials were used to call <code>GetFederationToken</code> .
     * AWS allows the federated user's request only when both the federated
     * user <i> and </i> the IAM user are explicitly allowed to perform the
     * requested action. The passed policy cannot grant more permissions than
     * those that are defined in the IAM user policy.
     * </p>
     * <p>
     * A typical use case is that the permissions of the IAM user whose
     * credentials are used to call <code>GetFederationToken</code> are
     * designed to allow access to all the actions and resources that any
     * federated user will need. Then, for individual users, you pass a
     * policy to the operation that scopes down the permissions to a level
     * that's appropriate to that individual user, using a policy that allows
     * only a subset of permissions that are granted to the IAM user.
     * </p>
     * <p>
     * If you do not pass a policy, the resulting temporary security
     * credentials have no effective permissions. The only exception is when
     * the temporary security credentials are used to access a resource that
     * has a resource-based policy that specifically allows the federated
     * user to access the resource.
     * </p>
     * <p>
     * For more information about how permissions work, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_getfederationtoken.html"> Permissions for GetFederationToken </a> . For information about using <code>GetFederationToken</code> to create temporary security credentials, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_getfederationtoken"> GetFederationToken???Federation Through a Custom Identity Broker </a>
     * .
     * </p>
     *
     * @param getFederationTokenRequest Container for the necessary
     *           parameters to execute the GetFederationToken service method on
     *           AWSSecurityTokenService.
     * 
     * @return The response from the GetFederationToken service method, as
     *         returned by AWSSecurityTokenService.
     * 
     * @throws PackedPolicyTooLargeException
     * @throws MalformedPolicyDocumentException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSecurityTokenService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetFederationTokenResult getFederationToken(GetFederationTokenRequest getFederationTokenRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a set of temporary security credentials (consisting of an
     * access key ID, a secret access key, and a security token) that you can
     * use to access AWS resources that you might not normally have access
     * to. Typically, you use <code>AssumeRole</code> for cross-account
     * access or federation.
     * </p>
     * <p>
     * <b>Important:</b> You cannot call <code>AssumeRole</code> by using
     * AWS account credentials; access will be denied. You must use IAM user
     * credentials or temporary security credentials to call
     * <code>AssumeRole</code> .
     * </p>
     * <p>
     * For cross-account access, imagine that you own multiple accounts and
     * need to access resources in each account. You could create long-term
     * credentials in each account to access those resources. However,
     * managing all those credentials and remembering which one can access
     * which account can be time consuming. Instead, you can create one set
     * of long-term credentials in one account and then use temporary
     * security credentials to access all the other accounts by assuming
     * roles in those accounts. For more information about roles, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html"> IAM Roles (Delegation and Federation) </a>
     * in the <i>Using IAM</i> .
     * </p>
     * <p>
     * For federation, you can, for example, grant single sign-on access to
     * the AWS Management Console. If you already have an identity and
     * authentication system in your corporate network, you don't have to
     * recreate user identities in AWS in order to grant those user
     * identities access to AWS. Instead, after a user has been
     * authenticated, you call <code>AssumeRole</code> (and specify the role
     * with the appropriate permissions) to get temporary security
     * credentials for that user. With those temporary security credentials,
     * you construct a sign-in URL that users can use to access the console.
     * For more information, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp.html#sts-introduction"> Common Scenarios for Temporary Credentials </a>
     * in the <i>Using IAM</i> .
     * </p>
     * <p>
     * The temporary security credentials are valid for the duration that
     * you specified when calling <code>AssumeRole</code> , which can be from
     * 900 seconds (15 minutes) to 3600 seconds (1 hour). The default is 1
     * hour.
     * </p>
     * <p>
     * Optionally, you can pass an IAM access policy to this operation. If
     * you choose not to pass a policy, the temporary security credentials
     * that are returned by the operation have the permissions that are
     * defined in the access policy of the role that is being assumed. If you
     * pass a policy to this operation, the temporary security credentials
     * that are returned by the operation have the permissions that are
     * allowed by both the access policy of the role that is being assumed,
     * <i> and </i> the policy that you pass. This gives you a way to further
     * restrict the permissions for the resulting temporary security
     * credentials. You cannot use the passed policy to grant permissions
     * that are in excess of those allowed by the access policy of the role
     * that is being assumed. For more information, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"> Permissions for AssumeRole, AssumeRoleWithSAML, and AssumeRoleWithWebIdentity </a>
     * in the <i>Using IAM</i> .
     * </p>
     * <p>
     * To assume a role, your AWS account must be trusted by the role. The
     * trust relationship is defined in the role's trust policy when the role
     * is created. You must also have a policy that allows you to call
     * <code>sts:AssumeRole</code> .
     * </p>
     * <p>
     * <b>Using MFA with AssumeRole</b>
     * </p>
     * <p>
     * You can optionally include multi-factor authentication (MFA)
     * information when you call <code>AssumeRole</code> . This is useful for
     * cross-account scenarios in which you want to make sure that the user
     * who is assuming the role has been authenticated using an AWS MFA
     * device. In that scenario, the trust policy of the role being assumed
     * includes a condition that tests for MFA authentication; if the caller
     * does not include valid MFA information, the request to assume the role
     * is denied. The condition in a trust policy that tests for MFA
     * authentication might look like the following example.
     * </p>
     * <p>
     * <code>"Condition": {"Bool": {"aws:MultiFactorAuthPresent":
     * true}}</code>
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/MFAProtectedAPI.html"> Configuring MFA-Protected API Access </a>
     * in the <i>Using IAM</i> guide.
     * </p>
     * <p>
     * To use MFA with <code>AssumeRole</code> , you pass values for the
     * <code>SerialNumber</code> and <code>TokenCode</code> parameters. The
     * <code>SerialNumber</code> value identifies the user's hardware or
     * virtual MFA device. The <code>TokenCode</code> is the time-based
     * one-time password (TOTP) that the MFA devices produces.
     * </p>
     * <p>
     * 
     * </p>
     * <p>
     * 
     * </p>
     * <p>
     * 
     * </p>
     * <p>
     * 
     * </p>
     * <p>
     * 
     * </p>
     *
     * @param assumeRoleRequest Container for the necessary parameters to
     *           execute the AssumeRole service method on AWSSecurityTokenService.
     * 
     * @return The response from the AssumeRole service method, as returned
     *         by AWSSecurityTokenService.
     * 
     * @throws PackedPolicyTooLargeException
     * @throws MalformedPolicyDocumentException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSecurityTokenService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AssumeRoleResult assumeRole(AssumeRoleRequest assumeRoleRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a set of temporary credentials for an AWS account or IAM
     * user. The credentials consist of an access key ID, a secret access
     * key, and a security token. Typically, you use
     * <code>GetSessionToken</code> if you want to use MFA to protect
     * programmatic calls to specific AWS APIs like Amazon EC2
     * <code>StopInstances</code> . MFA-enabled IAM users would need to call
     * <code>GetSessionToken</code> and submit an MFA code that is associated
     * with their MFA device. Using the temporary security credentials that
     * are returned from the call, IAM users can then make programmatic calls
     * to APIs that require MFA authentication. If you do not supply a
     * correct MFA code, then the API returns an access denied error.
     * </p>
     * <p>
     * The <code>GetSessionToken</code> action must be called by using the
     * long-term AWS security credentials of the AWS account or an IAM user.
     * Credentials that are created by IAM users are valid for the duration
     * that you specify, between 900 seconds (15 minutes) and 129600 seconds
     * (36 hours); credentials that are created by using account credentials
     * have a maximum duration of 3600 seconds (1 hour).
     * </p>
     * <p>
     * <b>NOTE:</b> We recommend that you do not call GetSessionToken with
     * root account credentials. Instead, follow our best practices by
     * creating one or more IAM users, giving them the necessary permissions,
     * and using IAM users for everyday interaction with AWS.
     * </p>
     * <p>
     * The permissions associated with the temporary security credentials
     * returned by <code>GetSessionToken</code> are based on the permissions
     * associated with account or IAM user whose credentials are used to call
     * the action. If <code>GetSessionToken</code> is called using root
     * account credentials, the temporary credentials have root account
     * permissions. Similarly, if <code>GetSessionToken</code> is called
     * using the credentials of an IAM user, the temporary credentials have
     * the same permissions as the IAM user.
     * </p>
     * <p>
     * For more information about using <code>GetSessionToken</code> to
     * create temporary credentials, go to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_getsessiontoken"> Temporary Credentials for Users in Untrusted Environments </a>
     * in the <i>Using IAM</i> .
     * </p>
     * 
     * @return The response from the GetSessionToken service method, as
     *         returned by AWSSecurityTokenService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSecurityTokenService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetSessionTokenResult getSessionToken() throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
        