package top.taidu.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import top.taidu.po.Type;


public interface TypeService {
    Type saveType(Type type);

    Type getType(Long id);

    Page<Type> listType(Pageable pageable);

    Type updateType(Long id, Type type);

    void deleteType(Long id);

    Type getTypeByName(String name);
}
