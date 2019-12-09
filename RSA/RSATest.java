public class RSATest {
  public static void main(String[] args){
        // 待加密内容
        String content = "abcdefg456789+-";
 
        // 经 BASE64 处理之后的公钥和私钥
        String publicKeyStr = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAs02q0YdzYndJXqvr+DiFwfeQ+VSXSz3yj6vlCmvcorkKs0qIchDNd20/xY12a8hh2p8HkAt8lTL0qpC+dDahMJk8OIoeSltAHPwneUMu6EdeG5F5HNBQfuzFcFDEjZFI2mdUMsSFZqyw5HlNGF12YPNbOrR5FTiRcTRUgzlvcXM1gDDwbxpZY3rNZpoXvIwpsKMrlB+DTkn9802Qwrs07u+UCaCCqxnAQGmCiGwKbha/jQTa/1Y5aTtC9Zn+RPjvjZ+M03GZfin3u0rhLRGNJfcRsDd5zcdsZwsf8fId+TpcuHOOUvvkcLT/WEL5I5TQV0o2AR41BNW2cGOxFL+0xwIDAQAB";
        String privateKeyStr = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCzTarRh3Nid0leq+v4OIXB95D5VJdLPfKPq+UKa9yiuQqzSohyEM13bT/FjXZryGHanweQC3yVMvSqkL50NqEwmTw4ih5KW0Ac/Cd5Qy7oR14bkXkc0FB+7MVwUMSNkUjaZ1QyxIVmrLDkeU0YXXZg81s6tHkVOJFxNFSDOW9xczWAMPBvGlljes1mmhe8jCmwoyuUH4NOSf3zTZDCuzTu75QJoIKrGcBAaYKIbApuFr+NBNr/VjlpO0L1mf5E+O+Nn4zTcZl+Kfe7SuEtEY0l9xGwN3nNx2xnCx/x8h35Oly4c45S++RwtP9YQvkjlNBXSjYBHjUE1bZwY7EUv7THAgMBAAECggEAQHjD3DV1Ism7owP0hDtmtRkcktp80DxFFK39XGLuYcBhfZhmOYWbK78nuBQmqZjSvraCFKRctpUs7ou/P7BJA12GDtpzC8+F3SY511t16WWIDCehwd+RoiHm2HziP/kmlgmjd+G8CfA8ZtrLAuDQaQn4GsK76wp9GZR0cv7a+JKW0LyaTDidTx8fYGsKHV4odps/erR08SBBs5rUETRXcJpGktOUe7k7YlNHCJf+Y1W5yKKehWvTh71veayhjBzxv9RqR0fVgnJDUMVEPATaTj1pVKyZgA/9oia9m8yXAnCVR6GutH0P1FisFijnAN1CpVbHeKhUy1KLZeemGG0zgQKBgQDqQRg9HBwfAHbzWE2NLRcCPIl5UOimYFeRRSBY+7DfDZFCu/jfmgh4mhrlJzDkny7dAJGtfSSM+ozppahuDB6uZjWHrbKZu2WG0qQwWojDAKsfY/TbsWlFm+TLhfALsFnSlVbTpUWqcG6/B/Jdd07ieccGFwTfLNCFdH6b64vDBwKBgQDD8rMHKQcvTEXdQTZGqJ1crTwqXuU3XMOau4h27VR7snDe4xpwl1rsP5W5SiraP5/9EtPwGKwjnEPUSWRHvj2wtBs/SB4A1VBdzKY+yM98eFzSf9HJZRra42SlU/Fw/jHKkRAUkp7gluc5DwZi7JfuxXS1RVgfMWbsTLKT8udQQQKBgQDlPUqBEu8aD5RYU0OhMkzf7WoDBICHwKQxD1q2eaf+wAI1Mko8VzqO+w/yzEV2laiAsbvd8SdBpzcatvh6qPWlaXRdEEhFVTPnml7+yronSpIrp9/I1nbUndhqquncJnngMDDF8WiZgGmAHEC74rOZwd5YQVKNLAfrcbMs1nbxJQKBgQC3SfOq8/bTiF4lq5VQnPKtuSH5ZFC265/QwjDRRgjruCuaYgbeYMXdDVFJRBY3lqJaAN2czgdfPBG6pngWH97mxmJiXFwsXVzSkNbFDeP/wzrYcFXVNCzdqS0A9Td4gV4j5HONOuVAogdhuSs5J6Sq5arY0Sev7e8fhFLaz7ENwQKBgQDjRRfpDUqxeZNjjx0Huu5EFe776ATLxhXHJT7xT7+NXKQK+SwzGMnYPK6fHlkoCOACIX0yqm2CqFNv/XT2rYJ2mFsXs4uDYV7QSDfqJ4fMyUQxsYzqQH/qBi2gP630+il7UmIA7Uddsfl6Wx8ugICX2frUTLNu6/B0a0hFiO++bw==";
 
        try{
            PrivateKey privateKey = RSAUtil.string2Privatekey(privateKeyStr);
            PublicKey publicKey = RSAUtil.string2PublicKey(publicKeyStr);
 
 
            // 加密
//            byte[] encrypteds = RSAUtil.publicEncrytype(content.getBytes(), publicKey);
//            String encryptedBase64Str = Base64.getEncoder().encodeToString(encrypteds);
 
             String encryptedBase64Str = "MPgbiM3u3ZnY0X9ilqO6+hzlxXEEKYGDMdxbZMQOXAMN149WBK/i1AB8/TnSmbclcqC6oy/Xe3UnqxWJmiybTz8hXdAdZJ6HmWWN8LXajv+1ElJJr+ZKDd3kg/cj39UKmwSmCEccX8Ntaj8BYXPxvzZfAuRqp9xjQ5SQtvcxJu4E4dZ1ecnvWvWiYI9qnJWLjMUhPaqWwJlX1fS4dKTp8GCJ+ZMdh6+oU9090famP0l4RN8nxnIiJPEKX3Z/si5Ad2MjoeFyZKjyuHihyGGZ5Ilpvb4DZzqcv55uRKvr0D4XZDcZN9eumx+rcqUGtV2RsIpBsqleqNJ4y1Z0jk5YMA==";
             byte[] encrypteds = Base64.getDecoder().decode(encryptedBase64Str);
 
 
            // 解密
            byte[] dencrypteds = RSAUtil.privateDecrypt(encrypteds, privateKey);
            // byte[] dencrypteds = RSAUtil.privateDecrypt(Base64.getDecoder().decode(encryptedBase64Str), privateKey);
            String dencrypted = new String(dencrypteds, "utf8");
 
            // 信息打印
            System.out.println(
                    "公钥为（BASE64 处理之后）：" + publicKeyStr + "\n"
                    + "私钥为(BASE64 处理之后)：" + privateKeyStr + "\n"
                    + "公钥加密密文(BASE64 处理之后)：" + encryptedBase64Str + "\n"
                    + "私钥解密之后(UTF-8 处理之后)：" + dencrypted + "\n"
                    + "Java平台测试是否通过：" + (dencrypted.equals(content))
            );
 
            RSAUtil.getPublicKey(RSAUtil.getKeyPair());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
