public class AESTest {
  public static void main(String[] args){
        String content = "abcdefg789+-*+="; // 待加密的字符串
 
        String aesKey = "87726f89365f8171";
        String iv = "18f5ebf9346eb321";
 
        try {
            // 加密
            String encrypted = AESUtil.encryptAES(content.getBytes(), aesKey, iv);
            // 解密
            String decrypted = AESUtil.decryptAES(encrypted.getBytes(), aesKey, iv);
 
            System.out.println("加密之后的密文为：" + encrypted +
                    "\n" + "解密之后的明文为：" + decrypted +
                    "\n" + "原始明文为：" + content +
                    "\n" + "解密是否成功：" + (content.equals(decrypted)));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
