package com.zcbspay.platform.manager.merchant.certhandler;

import com.zcbspay.platform.manager.merchant.bean.CertType;
import com.zcbspay.platform.manager.merchant.pojo.PojoEnterpriseDetaApply;

/**
 * 
 * A interface to fix this problem: when upload a  cert picture of merchant,we don't know the
 * kind of cert.So add the interface to let cert add their file path in MerchDetaModel property.
 *
 * @author yangying
 * @version
 * @date 2015年12月18日 上午10:15:13
 * @since
 */
public abstract class CertPicHandler {
    protected CertType certType;
    /**
     * 
     * @param merchDeta
     * @param fileName
     */
    public abstract PojoEnterpriseDetaApply decorate(PojoEnterpriseDetaApply enterpriseApply,String path);
    /**
     * 
     * @param merchDeta
     * @param srcFileName
     * @return the file name after decorate
     */
    public String decorateFileName(String srcFileName){
        int position = srcFileName.lastIndexOf(".");
        String extension = srcFileName.substring(position);
        srcFileName = certType.getCode() + extension;
        return srcFileName; 
    }
    
    public abstract String getFileName(PojoEnterpriseDetaApply enterpriseApply);
}
