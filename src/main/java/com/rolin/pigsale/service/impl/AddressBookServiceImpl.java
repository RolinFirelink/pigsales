package com.rolin.pigsale.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rolin.pigsale.entity.AddressBook;
import com.rolin.pigsale.mapper.AddressBookMapper;
import com.rolin.pigsale.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
