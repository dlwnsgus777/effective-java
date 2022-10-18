package effective.code.chapter01.item07.optional;

import effective.code.chapter01.item07.optional.Channel;
import effective.code.chapter01.item07.optional.MemberShip;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class ChannelTest {
   @Test
   void npe() {
      Channel channel = new Channel();
      Optional<MemberShip> optional = channel.defaultMemberShip();
      optional.ifPresent(MemberShip::hello);
   }
}