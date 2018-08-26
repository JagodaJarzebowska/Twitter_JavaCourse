package com.sda.twitter;

import com.github.mjeanroy.junit.servers.annotations.TestServer;
import com.github.mjeanroy.junit.servers.jetty.EmbeddedJetty;
import com.github.mjeanroy.junit.servers.runner.JunitServerRunner;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

import static org.junit.Assert.assertThat;

@RunWith(JunitServerRunner.class)
public class MessageServletInterationTest {
    @TestServer
    public static EmbeddedJetty jetty;
    private HttpClient client;

    @Before
    public void setup() {
        client = HttpClientBuilder.create().build();
    }

    @Test
    public void should_ReturnMessageForm_When_PerformGetOnRootEndPoint() throws IOException {
        //when
        HttpResponse response = client.execute(new HttpGet(jetty.getUrl()));
        //then
        String html = EntityUtils.toString(response.getEntity());
        assertThat(html, Matchers.containsString("form"));
    }
}
