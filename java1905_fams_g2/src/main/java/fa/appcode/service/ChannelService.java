package fa.appcode.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fa.appcode.model.Channel;

@Service
public interface ChannelService {

	List<Channel> findAllChannel();
}
