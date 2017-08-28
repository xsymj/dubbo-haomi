/**
 * 
 */
/**
 * @author xusiyuan
 *
 */
package cn.com.haomi.order.imp;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.com.haomi.inteface.order.service.OrderService;
import cn.com.haomi.order.mapper.OrderMapper;

@Component
public class OrderServiceImp implements OrderService{
	
	@Resource
	private OrderMapper orderMapper;
	
	
	public List<Map<String, Object>> list() {
		return orderMapper.list();
	}
	
}