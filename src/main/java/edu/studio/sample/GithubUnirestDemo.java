package edu.studio.sample;
import kong.unirest.Unirest;
public class GithubUnirestDemo {
    final static String GITHUB_API_URI="https://api.github.com/repos/CSC8545-Spring2022-Org/maven-lab-csc8545-s22-NavyaLingisetty/issues/2";
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String getAllResponse=Unirest.get(GITHUB_API_URI)
                .header("Authorization","Bearer "+args[0])
                .asString().getBody();
        System.out.println("GET ALL"+getAllResponse);
        
    }

}
