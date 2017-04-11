package com.jackie.smartapi.dao.impl;

import com.jackie.smartapi.Model.Project;
import com.jackie.smartapi.dao.ProjectDAO;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * ProjectImpl Tester.
 *
 * @author <Jackie Lu>
 * @version 1.0
 * @since <pre>���� 10, 2017</pre>
 */
public class ProjectImplTest {

    static ApplicationContext ctx;

    @Before
    public void before() throws Exception {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: createProject(Project project)
     */
    @Test
    public void testCreateProject() throws Exception {
        ProjectDAO projectDAO = (ProjectDAO) ctx.getBean("projectDAO");

        Project project = new Project();
        project.setName("P3");
        project.setCreatetime(String.valueOf(new Date()));
        project.setCreator("jackie");
        project.setId(01);
        project.setNote("this is a test");
        projectDAO.createProject(project);
    }

    @Test
    public void testGetAllProject() throws Exception {
        ProjectDAO projectDAO = (ProjectDAO) ctx.getBean("projectDAO");
        List<Map<String, Object>> res = projectDAO.getAllProject();
        System.out.println(res.size());
    }

} 
