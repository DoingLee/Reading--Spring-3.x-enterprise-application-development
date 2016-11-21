
package com.baobaotao.ws.client.saaj;

public class ForumClientMain {
    public static void main(String[] args) throws Exception {
        String url = "http://localhost:8088/baobaotao/service";
        BbtForumServiceClient bbtForumServiceClient = new BbtForumServiceClient(url);
        bbtForumServiceClient.getRefinedTopicCount();
    }
}
