import { AESUtil } from './AESUtil'    
 
    // 测试的明文
    let content = "abcdefg789+-*+="    
    let IV = "BjNzhiZDctOGMxOS" // 注意IV必须是 16 个字节 8*16 = 128 位
    let aesKey = "I0YmM5NTgtY2IyYi00OWIzLWFkZTktZj" // 由于采用的 AES-256， 所以 Key 为 32 个字节 32*8 = 256
 
 
    // 加密：
    let encrypted = AESUtil.encrypt(content, aesKey, IV); 
 
    // 解密：
    let decrypted = AESUtil.decrypt(encrypted, aesKey, IV);
 
    console.log("密钥为：" + aesKey)
    console.log("初始化向量为：" + IV)
    console.log("密文：" + encrypted)
    console.log("明文：" + decrypted)
    console.log("解密之后是否与之前相同：" + (content === decrypted))
