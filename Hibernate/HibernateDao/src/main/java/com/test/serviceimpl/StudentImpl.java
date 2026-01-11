package com.test.serviceimpl;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.test.entities.Student;
import com.test.services.StudentDao;
import com.test.utilities.DBUtil;

public class StudentImpl implements StudentDao {
	
		//	INSERT_DATA
			@Override
			public void addstudent(Student student) {
//				Session session=null;
				try(Session session=DBUtil.getSession()) {
				Transaction tx=session.beginTransaction();
				session.save(student);
				System.out.println("studnet added");
				tx.commit();
			}catch(Exception e) {
				e.printStackTrace();
				
			}
		}
			
//			GET_DATA
			@Override
			public Student getstudent() {
				try(Session session=DBUtil.getSession()){
					Transaction tx=session.beginTransaction();
					Student data=session.get(Student.class, 990);
					System.out.println(data.getName());
					tx.commit();
					return data;
					
				}catch(Exception e) {
					e.printStackTrace();
					return null;
				}
			}
			
//			DELETE_DATA
			@Override
			public void deletestudent() {
				try(Session session=DBUtil.getSession()){
					Transaction tx=session.beginTransaction();
					Student data=session.get(Student.class, 992);
					if(data!=null) {
						session.delete(data);
						System.out.println("data deleted");
					}else {
						System.out.println("studnt not found");
					}
					tx.commit();
				}catch(Exception e) {
					e.printStackTrace();
					
				}
			}
			
			
//			UPDATE_DATA	
			@Override
			public void updatestudent() {
				try(Session session=DBUtil.getSession()){
					Transaction tx=session.beginTransaction();
					Student data=session.get(Student.class, 993);
					if(data!=null) {
						data.setName("govinda");
						session.update(data);
						System.out.println("data updated");
					}else {
						System.out.println("studnt not found");
					}
					tx.commit();
					
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			
}
