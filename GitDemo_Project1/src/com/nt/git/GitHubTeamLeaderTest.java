package com.nt.git;

import com.nt.add.Addition;
import com.nt.sub.Substraction;

public class GitHubTeamLeaderTest {
 public static void main(String [] args){
	 System.out.println("Welcome to Git created by Team Leader");
	 Addition addition = new Addition();
	 System.out.println("Addition Result:"+ addition.add(100, 200));
	 Substraction substraction = new Substraction();
	 System.out.println("Substraction Result:" + substraction.sub(500, 100));
	 
 }
}
