package com.wangjzh.common.redis;


import org.springframework.core.convert.converter.Converter;
import org.springframework.core.serializer.support.DeserializingConverter;
import org.springframework.core.serializer.support.SerializingConverter;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

/**
 * @description redis序列化工具
 * @author wangjzh
 * @version 1.0.0
 * @date 2018-6-7 00:45:09
 */
public class RedisObjectSerializer implements RedisSerializer<Object> {

    //序列化容器
    private Converter<Object,byte[]> serializer = new SerializingConverter();
    //反序列化容器
    private Converter<byte[],Object> deserializer = new DeserializingConverter();

    static final byte[] EMPTY_ARRAY = new byte[0];

    @Override
    public byte[] serialize(Object o) throws SerializationException {
        if (o == null)
            return EMPTY_ARRAY;

        try {
            return serializer.convert(o);
        }catch (Exception ex){
            return EMPTY_ARRAY;
        }
    }

    @Override
    public Object deserialize(byte[] bytes) throws SerializationException {
        if(isEmpty(bytes))
            return null;

        try{
            return deserializer.convert(bytes);
        }catch (Exception e){
            return null;
        }
    }

    private boolean isEmpty(byte[] bytes){
        return (bytes == null || bytes.length == 0);
    }
}
