// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.signalr.SignalRManager;
import com.azure.resourcemanager.signalr.models.AclAction;
import com.azure.resourcemanager.signalr.models.FeatureFlags;
import com.azure.resourcemanager.signalr.models.ManagedIdentityType;
import com.azure.resourcemanager.signalr.models.ServiceKind;
import com.azure.resourcemanager.signalr.models.SignalRRequestType;
import com.azure.resourcemanager.signalr.models.SignalRResource;
import com.azure.resourcemanager.signalr.models.SignalRSkuTier;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SignalRsGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"sku\":{\"name\":\"dvruzslzojhpctf\",\"tier\":\"Basic\",\"size\":\"otngfdgu\",\"family\":\"yzihgrkyuizabsn\",\"capacity\":1225103578},\"properties\":{\"provisioningState\":\"Succeeded\",\"externalIP\":\"eevy\",\"hostName\":\"hsgz\",\"publicPort\":296401749,\"serverPort\":396816762,\"version\":\"mfg\",\"privateEndpointConnections\":[{\"properties\":{\"provisioningState\":\"Deleting\",\"privateEndpoint\":{},\"groupIds\":[\"hibetnluankrr\"],\"privateLinkServiceConnectionState\":{}},\"id\":\"eebtijvacvb\",\"name\":\"qzbqqxlajrnwxa\",\"type\":\"evehjkuyxoaf\"},{\"properties\":{\"provisioningState\":\"Moving\",\"privateEndpoint\":{},\"groupIds\":[\"aeylinm\"],\"privateLinkServiceConnectionState\":{}},\"id\":\"xirpghriy\",\"name\":\"oqeyhlqhykprl\",\"type\":\"yznuciqd\"}],\"sharedPrivateLinkResources\":[{\"properties\":{\"groupId\":\"iitdfuxt\",\"privateLinkResourceId\":\"asiibmiybnnust\",\"provisioningState\":\"Updating\",\"requestMessage\":\"hnmgixhcm\",\"status\":\"Approved\"},\"id\":\"qfoudorhcgyy\",\"name\":\"rotwypundmbxhugc\",\"type\":\"jkavl\"}],\"tls\":{\"clientCertEnabled\":false},\"hostNamePrefix\":\"ftpmdtzfjltfv\",\"features\":[{\"flag\":\"ServiceMode\",\"value\":\"jtotpvopvpbd\",\"properties\":{\"mkyi\":\"gqqihedsvqwt\",\"qcwdhoh\":\"cysihs\",\"sufco\":\"dtmcd\",\"vhdbevwqqxey\":\"dxbzlmcmuap\"}},{\"flag\":\"ServiceMode\",\"value\":\"onqzinkfkbgbzbow\",\"properties\":{\"ljmygvkzqkjjeokb\":\"o\"}},{\"flag\":\"EnableLiveTrace\",\"value\":\"fezrx\",\"properties\":{\"wvz\":\"urtleipqxb\",\"noda\":\"nzvdfbzdixzmq\",\"sbostzel\":\"opqhewjptmc\",\"tmzlbiojlv\":\"dlat\"}}],\"liveTraceConfiguration\":{\"enabled\":\"bbpneqvcwwy\",\"categories\":[{\"name\":\"ochpprpr\",\"enabled\":\"mo\"}]},\"resourceLogConfiguration\":{\"categories\":[{\"name\":\"jnhlbkpbzpcpiljh\",\"enabled\":\"zv\"},{\"name\":\"h\",\"enabled\":\"bnwieholew\"}]},\"cors\":{\"allowedOrigins\":[\"ubwefqs\"]},\"serverless\":{\"connectionTimeoutInSeconds\":1697750371},\"upstream\":{\"templates\":[{\"hubPattern\":\"rrqwexjk\",\"eventPattern\":\"xap\",\"categoryPattern\":\"og\",\"urlTemplate\":\"qnobp\",\"auth\":{}}]},\"networkACLs\":{\"defaultAction\":\"Deny\",\"publicNetwork\":{\"allow\":[\"ServerConnection\",\"ServerConnection\",\"RESTAPI\",\"RESTAPI\"],\"deny\":[\"Trace\",\"Trace\",\"Trace\"]},\"privateEndpoints\":[{\"name\":\"bucljgkyexaogu\",\"allow\":[\"ClientConnection\"],\"deny\":[\"RESTAPI\",\"Trace\",\"ClientConnection\",\"RESTAPI\"]},{\"name\":\"ltxijjumfqwazln\",\"allow\":[\"Trace\"],\"deny\":[\"RESTAPI\"]},{\"name\":\"zqdqxt\",\"allow\":[\"ClientConnection\",\"Trace\",\"ClientConnection\",\"Trace\"],\"deny\":[\"RESTAPI\"]},{\"name\":\"zsvtuikzhajqgl\",\"allow\":[\"RESTAPI\"],\"deny\":[\"ServerConnection\",\"RESTAPI\",\"ServerConnection\"]}]},\"publicNetworkAccess\":\"y\",\"disableLocalAuth\":true,\"disableAadAuth\":false},\"kind\":\"SignalR\",\"identity\":{\"type\":\"None\",\"userAssignedIdentities\":{\"vntjlrigjk\":{\"principalId\":\"nptgoeiybba\",\"clientId\":\"fhvfsl\"},\"xwaabzmifrygznmm\":{\"principalId\":\"yrio\",\"clientId\":\"zid\"},\"opxlhslnelxieixy\":{\"principalId\":\"ri\",\"clientId\":\"zob\"}},\"principalId\":\"lxecwcrojphslh\",\"tenantId\":\"wjutifdwfmv\"},\"location\":\"orq\",\"tags\":{\"aglkafhon\":\"tzh\",\"ickpz\":\"juj\"},\"id\":\"cpopmxel\",\"name\":\"wcltyjede\",\"type\":\"xm\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        SignalRManager manager =
            SignalRManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        SignalRResource response =
            manager
                .signalRs()
                .getByResourceGroupWithResponse("rzpasccbiuimzdly", "dfqwmkyoq", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("orq", response.location());
        Assertions.assertEquals("tzh", response.tags().get("aglkafhon"));
        Assertions.assertEquals("dvruzslzojhpctf", response.sku().name());
        Assertions.assertEquals(SignalRSkuTier.BASIC, response.sku().tier());
        Assertions.assertEquals(1225103578, response.sku().capacity());
        Assertions.assertEquals(ServiceKind.SIGNALR, response.kind());
        Assertions.assertEquals(ManagedIdentityType.NONE, response.identity().type());
        Assertions.assertEquals(false, response.tls().clientCertEnabled());
        Assertions.assertEquals(FeatureFlags.SERVICE_MODE, response.features().get(0).flag());
        Assertions.assertEquals("jtotpvopvpbd", response.features().get(0).value());
        Assertions.assertEquals("gqqihedsvqwt", response.features().get(0).properties().get("mkyi"));
        Assertions.assertEquals("bbpneqvcwwy", response.liveTraceConfiguration().enabled());
        Assertions.assertEquals("ochpprpr", response.liveTraceConfiguration().categories().get(0).name());
        Assertions.assertEquals("mo", response.liveTraceConfiguration().categories().get(0).enabled());
        Assertions.assertEquals("jnhlbkpbzpcpiljh", response.resourceLogConfiguration().categories().get(0).name());
        Assertions.assertEquals("zv", response.resourceLogConfiguration().categories().get(0).enabled());
        Assertions.assertEquals("ubwefqs", response.cors().allowedOrigins().get(0));
        Assertions.assertEquals(1697750371, response.serverless().connectionTimeoutInSeconds());
        Assertions.assertEquals("rrqwexjk", response.upstream().templates().get(0).hubPattern());
        Assertions.assertEquals("xap", response.upstream().templates().get(0).eventPattern());
        Assertions.assertEquals("og", response.upstream().templates().get(0).categoryPattern());
        Assertions.assertEquals("qnobp", response.upstream().templates().get(0).urlTemplate());
        Assertions.assertEquals(AclAction.DENY, response.networkACLs().defaultAction());
        Assertions
            .assertEquals(SignalRRequestType.SERVER_CONNECTION, response.networkACLs().publicNetwork().allow().get(0));
        Assertions.assertEquals(SignalRRequestType.TRACE, response.networkACLs().publicNetwork().deny().get(0));
        Assertions
            .assertEquals(
                SignalRRequestType.CLIENT_CONNECTION, response.networkACLs().privateEndpoints().get(0).allow().get(0));
        Assertions
            .assertEquals(SignalRRequestType.RESTAPI, response.networkACLs().privateEndpoints().get(0).deny().get(0));
        Assertions.assertEquals("bucljgkyexaogu", response.networkACLs().privateEndpoints().get(0).name());
        Assertions.assertEquals("y", response.publicNetworkAccess());
        Assertions.assertEquals(true, response.disableLocalAuth());
        Assertions.assertEquals(false, response.disableAadAuth());
    }
}
