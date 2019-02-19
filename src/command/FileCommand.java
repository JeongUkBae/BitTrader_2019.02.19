package command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import domain.CustomerDTO;
import domain.ImageDTO;
import enums.Action;
import proxy.ImageProxy;
import proxy.Proxy;
import proxy.RequestProxy;
import service.CustomerServiceImpl;
import service.ImageServiceImpl;

public class FileCommand extends Command {

	public FileCommand(Map<String, Proxy> pxy) {
		super(pxy);
		RequestProxy req = (RequestProxy) pxy.get("req");
		HttpServletRequest request = req.getRequest();

		switch (Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		case CUST_FILE_UPLOAD:
			System.out.println("[ ***파일 커맨드 업로드 진입*** ]");
			ImageProxy ipxy = new ImageProxy();
			ipxy.carryOut(request);
			// DB save
			ImageDTO image = ipxy.getImg();
			System.out.println("image??:::" + image);
			//ImageServiceImpl.getInstance().addImage(image);  
			//DB입력!
			CustomerDTO cust = CustomerServiceImpl.getInstance().fileUpload(ipxy);
			
			
			/*
			 * CustomerDTO cust = new CustomerDTO(); 
			 * cust.setCustomerID(customerID); cust = CustomerServiceImpl.getInstance().retrieveCustomer(cust);
			 * ipxy.getImg().setOwner(request.getParameter("customer_id")); 
			 * CustomerDTO cust = CustomerServiceImpl.getInstance().fileUpload(ipxy);
			 * 
			 * request.setAttribute("image", image); 
			 * request.setAttribute("cust", cust);
			 */
			break;

		default:
			break;

		}

	}
}
