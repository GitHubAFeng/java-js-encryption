import {RSAUtil} from "./RSAUtil"
// RSA 测试
{
    let content = "abcdefg456789+-"
 
    // 生成密钥对
    // let keyPair = RSAUtil.getRSAKeyPair();
    
    let keyPair = {};
    keyPair.publicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAs02q0YdzYndJXqvr+DiFwfeQ+VSXSz3yj6vlCmvcorkKs0qIchDNd20/xY12a8hh2p8HkAt8lTL0qpC+dDahMJk8OIoeSltAHPwneUMu6EdeG5F5HNBQfuzFcFDEjZFI2mdUMsSFZqyw5HlNGF12YPNbOrR5FTiRcTRUgzlvcXM1gDDwbxpZY3rNZpoXvIwpsKMrlB+DTkn9802Qwrs07u+UCaCCqxnAQGmCiGwKbha/jQTa/1Y5aTtC9Zn+RPjvjZ+M03GZfin3u0rhLRGNJfcRsDd5zcdsZwsf8fId+TpcuHOOUvvkcLT/WEL5I5TQV0o2AR41BNW2cGOxFL+0xwIDAQAB"
    keyPair.privateKey = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCzTarRh3Nid0leq+v4OIXB95D5VJdLPfKPq+UKa9yiuQqzSohyEM13bT/FjXZryGHanweQC3yVMvSqkL50NqEwmTw4ih5KW0Ac/Cd5Qy7oR14bkXkc0FB+7MVwUMSNkUjaZ1QyxIVmrLDkeU0YXXZg81s6tHkVOJFxNFSDOW9xczWAMPBvGlljes1mmhe8jCmwoyuUH4NOSf3zTZDCuzTu75QJoIKrGcBAaYKIbApuFr+NBNr/VjlpO0L1mf5E+O+Nn4zTcZl+Kfe7SuEtEY0l9xGwN3nNx2xnCx/x8h35Oly4c45S++RwtP9YQvkjlNBXSjYBHjUE1bZwY7EUv7THAgMBAAECggEAQHjD3DV1Ism7owP0hDtmtRkcktp80DxFFK39XGLuYcBhfZhmOYWbK78nuBQmqZjSvraCFKRctpUs7ou/P7BJA12GDtpzC8+F3SY511t16WWIDCehwd+RoiHm2HziP/kmlgmjd+G8CfA8ZtrLAuDQaQn4GsK76wp9GZR0cv7a+JKW0LyaTDidTx8fYGsKHV4odps/erR08SBBs5rUETRXcJpGktOUe7k7YlNHCJf+Y1W5yKKehWvTh71veayhjBzxv9RqR0fVgnJDUMVEPATaTj1pVKyZgA/9oia9m8yXAnCVR6GutH0P1FisFijnAN1CpVbHeKhUy1KLZeemGG0zgQKBgQDqQRg9HBwfAHbzWE2NLRcCPIl5UOimYFeRRSBY+7DfDZFCu/jfmgh4mhrlJzDkny7dAJGtfSSM+ozppahuDB6uZjWHrbKZu2WG0qQwWojDAKsfY/TbsWlFm+TLhfALsFnSlVbTpUWqcG6/B/Jdd07ieccGFwTfLNCFdH6b64vDBwKBgQDD8rMHKQcvTEXdQTZGqJ1crTwqXuU3XMOau4h27VR7snDe4xpwl1rsP5W5SiraP5/9EtPwGKwjnEPUSWRHvj2wtBs/SB4A1VBdzKY+yM98eFzSf9HJZRra42SlU/Fw/jHKkRAUkp7gluc5DwZi7JfuxXS1RVgfMWbsTLKT8udQQQKBgQDlPUqBEu8aD5RYU0OhMkzf7WoDBICHwKQxD1q2eaf+wAI1Mko8VzqO+w/yzEV2laiAsbvd8SdBpzcatvh6qPWlaXRdEEhFVTPnml7+yronSpIrp9/I1nbUndhqquncJnngMDDF8WiZgGmAHEC74rOZwd5YQVKNLAfrcbMs1nbxJQKBgQC3SfOq8/bTiF4lq5VQnPKtuSH5ZFC265/QwjDRRgjruCuaYgbeYMXdDVFJRBY3lqJaAN2czgdfPBG6pngWH97mxmJiXFwsXVzSkNbFDeP/wzrYcFXVNCzdqS0A9Td4gV4j5HONOuVAogdhuSs5J6Sq5arY0Sev7e8fhFLaz7ENwQKBgQDjRRfpDUqxeZNjjx0Huu5EFe776ATLxhXHJT7xT7+NXKQK+SwzGMnYPK6fHlkoCOACIX0yqm2CqFNv/XT2rYJ2mFsXs4uDYV7QSDfqJ4fMyUQxsYzqQH/qBi2gP630+il7UmIA7Uddsfl6Wx8ugICX2frUTLNu6/B0a0hFiO++bw=="
    
    let encrypted = RSAUtil.publicKeyEncrypt(content, keyPair.publicKey);
    let dencrypted = RSAUtil.privateKeyDecrypt(encrypted, keyPair.privateKey);
    console.dir("密钥对：" + 
        "\n\t" + "公钥：" + keyPair.publicKey + 
        "\n\t" + "私钥：" + keyPair.privateKey
        )
    console.log("加密之后的密文(经 BASE64 处理)：" + encrypted)
    console.log("解密之后的明文：" + dencrypted.toString('utf8') +
        "\n" + "原始明文：" + content + 
        "\n" + "测试是否通过：" + ( dencrypted.toString('utf8') === content )
    )
}
