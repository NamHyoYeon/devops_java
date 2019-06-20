package com.example.post.repository;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static junit.framework.TestCase.*;

public class PostDAOTest {
    @Test
    public void testGetList(){
        //PostDAO dao = new PostDAO();
        //List<PostVo> list  = dao.getList();

        //assertTrue(condition.list.size()>0);
        //assertNotNull(list);
    }

    @Test
    public void testLogin() {
        PostDAO dao = new PostDAO();
        String id = "admin";
        String pwd = "1234";
        assertTrue(dao.login(id,pwd));
    }
}
