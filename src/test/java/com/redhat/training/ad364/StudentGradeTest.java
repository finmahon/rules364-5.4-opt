package com.redhat.training.ad364;

import com.redhat.training.ad364.model.FinanceAidGranted;
import com.redhat.training.ad364.model.Student;
import com.redhat.training.ad364.util.FinanceUtil;
import com.redhat.training.ad364.util.StudentUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class StudentGradeTest {

	private KieSession session;

	@Before
	public void setup() {
		KieServices service = KieServices.Factory.get();
		KieContainer container = service.getKieClasspathContainer();
		this.session = container.newKieSession("GradeSession");
	}

	@Test(timeout = 2000)
	public void rulesTerminateTest() {
		Student s1 = StudentUtil.createAimeStudent();
		session.insert(s1);
		session.fireAllRules();
	}


	@Test
	public void eligibleStudentTest() {
		Student s1 = StudentUtil.createAimeStudent();
		s1.setAppliedForFinanceAid(true);
		session.insert(s1);
		session.fireAllRules();
		Assert.assertNotEquals("Aime is eligible for financial aid but was not approved",
				session.getObjects().stream().filter(o -> o instanceof FinanceAidGranted).count(), 0);
	}

	@Test(timeout = 600)
	public void multipleStudentsPerfTest() {
		Student s1 = StudentUtil.createAimeStudent();
		s1.setAppliedForFinanceAid(true);
		Student s2 = StudentUtil.createAimeStudent();
		s2.setAppliedForFinanceAid(true);

		session.insert(s1);
		session.insert(s2);
		session.fireAllRules();
	}

	@After
	public void teardown() {
		this.session.dispose();
	}
}
