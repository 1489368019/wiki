package com.yeshiqi.wiki.service;

import com.yeshiqi.wiki.domain.Ebook;
import com.yeshiqi.wiki.domain.EbookExample;
import com.yeshiqi.wiki.mapper.EbookMapper;
import com.yeshiqi.wiki.req.EbookReq;
import com.yeshiqi.wiki.resp.EbookResp;
import com.yeshiqi.wiki.utils.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {

    //@Autowired
    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

        /*List<EbookResp> respList = new ArrayList<>();
        for (Ebook ebook : ebookList) {
            EbookResp ebookResp = new EbookResp();
            BeanUtils.copyProperties(ebook,ebookResp);
            respList.add(ebookResp);
        }*/

        List<EbookResp> respList = CopyUtil.copyList(ebookList, EbookResp.class);

        return respList;
    }
}
