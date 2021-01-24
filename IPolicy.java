package dao;


import java.util.List;

import model.Policy;

public interface IPolicy {
	 public int addPolicy(Policy policy);

	  public List<Policy> viewPolicy();

	  public int editPolicy(Policy policy);

	  public int removePolicy(Policy policy);
}
