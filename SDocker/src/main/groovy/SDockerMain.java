import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SDockerMain {

    /**
     * 日志记录器
     */

    private static final String defaultPort = "10055";
//    private static final String defaultPort = "10002";
    private static final String MAX_THREADS = "1024";
    private static final String WAR_PATH = "./war";

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        InputStream inS = new ClassPathResource("database.properties").getInputStream();
        properties.load(inS);
        String[] host = ((String)properties.get("database.host")).split("://")[1].split(":");
        MongoClient client = new MongoClient(host[0], Integer.parseInt(host[1]));
        MongoCollection collection = client.getDatabase("dockerdb").getCollection("dockers");
        Document query = new Document();
        query.put("serverType", "docker");
        collection.deleteOne(query);
//		docker.main.Main.main(new String[]{"-t", MAX_THREADS, "-p", defaultPort});
        chat.main.Main.main(new String[]{"-t", MAX_THREADS, "-p", defaultPort, "-w", WAR_PATH});
    }
}

