package pSerialize;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Team implements Serializable
{

	private String teamName;
	private String teamDescription;
	

	public Team(String teamName, String teamDescription){
		this.teamName  = teamName;
		this.teamDescription = teamDescription;
		}

	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", teamDescription=" + teamDescription + "]";
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamDescription() {
		return teamDescription;
	}

	public void setTeamDescription(String teamDescription) {
		this.teamDescription = teamDescription;
	}

}
