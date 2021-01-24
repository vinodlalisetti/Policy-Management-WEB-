package controller;

import java.util.List;

import dao.PolicyImpl;
import dao.IPolicy;
import model.Policy;
public class PolicyController {
	 IPolicy pImpl = new PolicyImpl();

	  public int addPolicy(int id, String name,long contact) {
	    Policy policy = new Policy(id, name,contact);
	    return pImpl.addPolicy(policy);
	  }

	  public List<Policy> viewpolicy() {
	    return pImpl.viewPolicy();
	  }

	  public int editPolicy(int id, String name,long contact) {
	    Policy policy = new Policy(id, name,contact);
	    return pImpl.editPolicy(policy);
	  }

	  public int removePolicy(int id) {
	    Policy policy = new Policy();
	    policy.setId(id);
	    return pImpl.removePolicy(policy);
	  }
}
