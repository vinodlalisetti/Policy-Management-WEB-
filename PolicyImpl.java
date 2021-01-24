package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Policy;
import util.Db;
import util.Query;
public class PolicyImpl implements IPolicy{
	PreparedStatement pst = null;
	  ResultSet rs = null;
	  int result = 0;

	  @Override
	  public int addPolicy(Policy policy) {
	    try {
	      pst = Db.getCon().prepareStatement(Query.addPolicy);
	      pst.setInt(1, policy.getId());
	      pst.setString(2, policy.getName());
	   
	      pst.setLong(3, policy.getContact());
	      result = pst.executeUpdate();
	    } catch (ClassNotFoundException | SQLException e) {
	      result = 0;
	    } finally {
	      try {
	        Db.getCon().close();
	        pst.close();
	      } catch (ClassNotFoundException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      } catch (SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      }
	    }
	    return result;
	  }
	  
	  @Override
	  public List<Policy> viewPolicy() {
	    List<Policy> policy = new ArrayList<Policy>();
	    try {
	      pst = Db.getCon().prepareStatement(Query.viewPolicy);
	      rs = pst.executeQuery();
	      while (rs.next()) {
	        Policy p = new Policy(rs.getInt(1), rs.getString(2), rs.getLong(3));
	        policy.add(p);
	      }

	    } catch (ClassNotFoundException | SQLException e) {
	      try {
	        Db.getCon().close();
	        pst.close();
	        rs.close();
	      } catch (ClassNotFoundException e1) {
	        // TODO Auto-generated catch block
	        e1.printStackTrace();
	      } catch (SQLException e1) {
	        // TODO Auto-generated catch block
	        e1.printStackTrace();
	      }

	    }
	    return policy;
	  }
	  
	  @Override
	  public int editPolicy(Policy policy) {
	    try {
	      pst = Db.getCon().prepareStatement(Query.editPolicy);
	      pst.setInt(3, policy.getId());
	      pst.setString(1, policy.getName());
	      
	      pst.setLong(2,policy.getContact());
	      result = pst.executeUpdate();
	    } catch (ClassNotFoundException | SQLException e) {
	      result = 0;
	    } finally {
	      try {
	        Db.getCon().close();
	        pst.close();
	      } catch (ClassNotFoundException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      } catch (SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      }
	    }
	    return result;
	  }
	  @Override
	  public int removePolicy(Policy policy) {
	    try {
	      pst = Db.getCon().prepareStatement(Query.removePolicy);
	      pst.setInt(1, policy.getId());
	      result = pst.executeUpdate();
	    } catch (ClassNotFoundException | SQLException e) {
	      result = 0;
	    } finally {
	      try {
	        Db.getCon().close();
	        pst.close();
	      } catch (ClassNotFoundException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      } catch (SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      }
	    }
	    return result;
	  }
}
