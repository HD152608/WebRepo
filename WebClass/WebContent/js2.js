/**
 * 
 */
$(document).ready(
		function() {
			$('#joinForm').submit(
					function(event) {
						// 자동으로 submit되는 걸 막기
						event.preventDefault();

						var name = $('#name').val();
						console.log(name);
						// 서버로 post 전송(ajax)
						$.post("http://httpbin.org/post", {
							"name" : name
						}, function(data) {
							// alert(data.form.name + '님 로그인 되었습니다.');
							var myModal = $('#joinModal');
							joinModal.modal();
							joinModal.find('.modal-body').text(
									data.form.name + '님 로그인 되었습니다.');
						});
					});
		});
