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
 * 用户服务接口
 * @author Administrator
 *
 */
public interface UserService {

	/**
	 * 测试GET方法(根据指定id获取资源)
	 * 
	 * 该方法将被 Get:/get/{id} 请求来调用
	 * 请求路径中的 id 参数将映射到 String id 参数上
	 * 请求体中的数据将自动转换为 JSON 格式并映射到 users参数上
	 * 返回的 Users类型的数据将自动转换为 JSON 格式并返回到客户端
	 * 
	 * @param id 用户id
	 * @return 返回用户对象
	 */
	@GET
	@Path("/get/{id}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Users get(@PathParam("id") String id);
	
	/**
	 * 测试POST方法(添加用户对象)
	 * @param  被添加用户对象
	 * @return 
	 */
	@POST
	@Path("/post")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON,MediaType.TEXT_XML }) 
	public Users post(Users users);

	
	/**
	 * 测试PUT方法(根据指定id更新用户对象)
	 * @param id 用户id
	 * @return 返回用户对象
	 */
	@PUT
	@Path("/put/{id}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Users put(@PathParam("id") String id,Users users);

	
	/**
	 * 测试DELETGE方法(删除指定用户对象)
	 * @param  被添加用户对象
	 * @return 
	 */
	@DELETE
	@Path("/delete/{id}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Users delete(@PathParam("id") String id);

}
