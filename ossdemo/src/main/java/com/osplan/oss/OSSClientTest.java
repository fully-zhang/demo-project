package com.osplan.oss;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.Bucket;

import java.io.File;
import java.util.List;

/**
 * Created by zhj on 2017/8/31 0031.
 */
public class OSSClientTest {

    private final static String ENDPOINT = "http://oss-cn-beijing.aliyuncs.com";

    private final static String ACCESSKEYID = "LTAI02XSzQJGHRg1";

    private final static String ACCESSKEYSECRET = "e668MPHgEOOdf0Hw5phfWmK3fL5zkd";

    public static void main(String[] args) {
        // 创建OSSClient实例
        OSSClient ossClient = new OSSClient(ENDPOINT, ACCESSKEYID, ACCESSKEYSECRET);
        // 列举bucket
        /*List<Bucket> buckets = ossClient.listBuckets();
        for (Bucket bucket : buckets) {
            System.out.println(" - " + bucket.getName());
        }*/

        // 上传文件
        ossClient.putObject("fully", "aliyun_java_sdk_20170629", new File("D:/project/aliyun_java_sdk_20170629.zip"));

        // 关闭client
        ossClient.shutdown();
    }

}
