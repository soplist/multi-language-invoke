import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInvPHP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaInvPHP test = new JavaInvPHP();  
        String r = test.execPHP("D:/wangkang/workspace/multi-language-invoke/src/invoked-php.php", "");  
        System.out.println(r);  
	}

	public String execPHP(String scriptName, String param) {  
        StringBuilder output = new StringBuilder();  
        BufferedReader input = null;  
        String phpPath = "D:/wangkang/program/php-7.0.6/php.exe";  
        try {  
            String line;  
            Process p = Runtime.getRuntime().exec(phpPath + " " +scriptName + " " + param);  
            input = new BufferedReader(new InputStreamReader(p.getInputStream()));  
            while ((line = input.readLine()) != null) {  
                output.append(line+"\n");  
                p.destroy();  
            }  
              
            if(line == null){  
                p.destroy();  
            }  
        } catch (Exception err) {  
            err.printStackTrace();  
        }finally{  
            if(input != null){  
                try {  
                    input.close();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
        return output.toString();  
    }  
}
