package com.offcn.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.offcn.pojo.Users;

/**
 * �û�����ӿ�
 * @author Administrator
 *
 */
public interface UserService {

	/**
	 * ����GET����(����ָ��id��ȡ��Դ)
	 * 
	 * �÷������� Get:/get/{id} ����������
	 * ����·���е� id ������ӳ�䵽 String id ������
	 * �������е����ݽ��Զ�ת��Ϊ JSON ��ʽ��ӳ�䵽 users������
	 * ���ص� Users���͵����ݽ��Զ�ת��Ϊ JSON ��ʽ�����ص��ͻ���
	 * 
	 * @param id �û�id
	 * @return �����û�����
	 */
	@GET
	@Path("/get/{id}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Users get(@PathParam("id") String id);
	
	/**
	 * ����POST����(����û�����)
	 * @param  ������û�����
	 * @return 
	 */
	@POST
	@Path("/post")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON,MediaType.TEXT_XML }) 
	public Users post(Users users);

	
	/**
	 * ����PUT����(����ָ��id�����û�����)
	 * @param id �û�id
	 * @return �����û�����
	 */
	@PUT
	@Path("/put/{id}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Users put(@PathParam("id") String id,Users users);

	
	/**
	 * ����DELETGE����(ɾ��ָ���û�����)
	 * @param  ������û�����
	 * @return 
	 */
	@DELETE
	@Path("/delete/{id}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Users delete(@PathParam("id") String id);

}
