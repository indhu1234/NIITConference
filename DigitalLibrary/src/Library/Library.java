package Library;


import java.util.Date;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Library {

	public static void main(String[] args)
	{
		   Configuration config=new Configuration();
		   config.configure("config.xml");
		   SessionFactory sessionfac=config.buildSessionFactory();
		   Session session=sessionfac.openSession();
		   books b=new books();
		  
		   b.setBname("C Programming");
		   b.setAuthor("Ashok kamthane");
		   b.setNob(100);
		   
		   Transaction tran=(Transaction) session.beginTransaction();
		   session.save(b);
		   
		   System.out.println("Datas added Successfully");
		   books b1=new books();
		   b1.setBname("C++ Programming");
		   b1.setAuthor("Ashok kamthane");
		   b1.setNob(100);
		   session.save(b1);
		   
		   books b2=new books();
		   b2.setBname("Java Programming");
		   b2.setAuthor("kamthane");
		   b2.setNob(100);
		   session.save(b2);
		   
		   
		   books b3=new books();
		   b3.setBname("Python Programming");
		   b3.setAuthor("Ashok");
		   b3.setNob(100);
		   session.save(b3);
		   
		   books b4=new books();
		   b4.setBname(".NET Programming");
		   b4.setAuthor("Dennis");
		   b4.setNob(100);
		   session.save(b4);
		   
		   
		   books b5=new books();
		   b5.setBname(" C# Programming");
		   b5.setAuthor("Ritchie");
		   b5.setNob(100);
		   session.save(b5);
		   
		      
		   tran.commit();
		   System.out.println("Datas added Successfully");
		   
		   
		   
		   
		   

	}

}
