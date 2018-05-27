import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class HdfsClientDemo {
    FileSystem fs=null;
    @Before
    public void init() throws IOException {
        Configuration configuration=new Configuration();
        fs=FileSystem.get(configuration);
    }

    @Test
    public  void  testUpload() throws IOException {
        fs.copyFromLocalFile(new Path("/Users/fangjingyao/yes.pub"),new Path("/access.log.copy"));
        fs.close();
    }
}
