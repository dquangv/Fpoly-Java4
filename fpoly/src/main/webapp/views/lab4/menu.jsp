<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<nav class="row">
		<nav class="navbar navbar-expand-lg bg-dark" data-bs-theme="dark">
			<div class="container-fluid">
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item"><a class="nav-link" aria-current="page"
							href="#">
								<div class="icon-container">
									<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
										fill="currentColor" class="bi bi-house" viewBox="0 0 16 16">
                                            <path
											d="M8.707 1.5a1 1 0 0 0-1.414 0L.646 8.146a.5.5 0 0 0 .708.708L2 8.207V13.5A1.5 1.5 0 0 0 3.5 15h9a1.5 1.5 0 0 0 1.5-1.5V8.207l.646.647a.5.5 0 0 0 .708-.708L13 5.793V2.5a.5.5 0 0 0-.5-.5h-1a.5.5 0 0 0-.5.5v1.293zM13 7.207V13.5a.5.5 0 0 1-.5.5h-9a.5.5 0 0 1-.5-.5V7.207l5-5z" />
                                        </svg>
									<span class="icon-text">Trang chủ</span>
								</div>
						</a></li>
						<li class="nav-item"><a class="nav-link" aria-current="page"
							href="#">
								<div class="icon-container">
									<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
										fill="currentColor" class="bi bi-list-task"
										viewBox="0 0 16 16">
                                            <path fill-rule="evenodd"
											d="M2 2.5a.5.5 0 0 0-.5.5v1a.5.5 0 0 0 .5.5h1a.5.5 0 0 0 .5-.5V3a.5.5 0 0 0-.5-.5zM3 3H2v1h1z" />
                                            <path
											d="M5 3.5a.5.5 0 0 1 .5-.5h9a.5.5 0 0 1 0 1h-9a.5.5 0 0 1-.5-.5M5.5 7a.5.5 0 0 0 0 1h9a.5.5 0 0 0 0-1zm0 4a.5.5 0 0 0 0 1h9a.5.5 0 0 0 0-1z" />
                                            <path fill-rule="evenodd"
											d="M1.5 7a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5H2a.5.5 0 0 1-.5-.5zM2 7h1v1H2zm0 3.5a.5.5 0 0 0-.5.5v1a.5.5 0 0 0 .5.5h1a.5.5 0 0 0 .5-.5v-1a.5.5 0 0 0-.5-.5zm1 .5H2v1h1z" />
                                        </svg>
									<span class="icon-text">Giới thiệu</span>
								</div>
						</a></li>
						<li class="nav-item"><a class="nav-link" aria-current="page"
							href="#">
								<div class="icon-container">
									<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
										fill="currentColor" class="bi bi-telephone-fill"
										viewBox="0 0 16 16">
                                            <path fill-rule="evenodd"
											d="M1.885.511a1.745 1.745 0 0 1 2.61.163L6.29 2.98c.329.423.445.974.315 1.494l-.547 2.19a.68.68 0 0 0 .178.643l2.457 2.457a.68.68 0 0 0 .644.178l2.189-.547a1.75 1.75 0 0 1 1.494.315l2.306 1.794c.829.645.905 1.87.163 2.611l-1.034 1.034c-.74.74-1.846 1.065-2.877.702a18.6 18.6 0 0 1-7.01-4.42 18.6 18.6 0 0 1-4.42-7.009c-.362-1.03-.037-2.137.703-2.877z" />
                                        </svg>
									<span class="icon-text">Liên hệ</span>
								</div>
						</a></li>
						<li class="nav-item"><a class="nav-link" aria-current="page"
							href="#">
								<div class="icon-container">
									<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
										fill="currentColor" class="bi bi-envelope-fill"
										viewBox="0 0 16 16">
                                            <path
											d="M.05 3.555A2 2 0 0 1 2 2h12a2 2 0 0 1 1.95 1.555L8 8.414zM0 4.697v7.104l5.803-3.558zM6.761 8.83l-6.57 4.027A2 2 0 0 0 2 14h12a2 2 0 0 0 1.808-1.144l-6.57-4.027L8 9.586zm3.436-.586L16 11.801V4.697z" />
                                        </svg>
									<span class="icon-text">Góp ý</span>
								</div>
						</a></li>
						<li class="nav-item"><a class="nav-link" aria-current="page"
							href="#">
								<div class="icon-container">
									<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
										fill="currentColor" class="bi bi-question-circle-fill"
										viewBox="0 0 16 16">
                                            <path
											d="M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0M5.496 6.033h.825c.138 0 .248-.113.266-.25.09-.656.54-1.134 1.342-1.134.686 0 1.314.343 1.314 1.168 0 .635-.374.927-.965 1.371-.673.489-1.206 1.06-1.168 1.987l.003.217a.25.25 0 0 0 .25.246h.811a.25.25 0 0 0 .25-.25v-.105c0-.718.273-.927 1.01-1.486.609-.463 1.244-.977 1.244-2.056 0-1.511-1.276-2.241-2.673-2.241-1.267 0-2.655.59-2.75 2.286a.237.237 0 0 0 .241.247m2.325 6.443c.61 0 1.029-.394 1.029-.927 0-.552-.42-.94-1.029-.94-.584 0-1.009.388-1.009.94 0 .533.425.927 1.01.927z" />
                                        </svg>
									<span class="icon-text">Hỏi đáp</span>
								</div>
						</a></li>
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" role="button"
							data-bs-toggle="dropdown" aria-expanded="false"><svg
									xmlns="http://www.w3.org/2000/svg" width="16" height="16"
									fill="currentColor" class="bi bi-person-fill"
									viewBox="0 0 16 16">
                                        <path
										d="M3 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6" />
                                    </svg> Tài khoản </a>
							<ul class="dropdown-menu"
								style="border-color: gray; border-radius: 2px;">
								<li><a class="dropdown-item" href="#"><i
										class="fa-solid fa-right-to-bracket"></i> Đăng nhập</a></li>
								<li><a class="dropdown-item" href="#"><i
										class="fa-solid fa-key"></i> Quên mật khẩu</a></li>
								<li><a class="dropdown-item" href="#"><i
										class="fa-solid fa-user-plus"></i> Đăng kí thành viên</a></li>
								<li>
									<hr class="dropdown-divider-black">
								</li>
								<li><a class="dropdown-item" href="#"><i
										class="fa-solid fa-right-from-bracket"></i> Đăng xuất</a></li>
								<li><a class="dropdown-item" href="#"><i
										class="fa-solid fa-arrow-rotate-right"></i> Đổi mật khẩu</a></li>
								<li><a class="dropdown-item" href="#"><i
										class="fa-solid fa-pen-to-square"></i> Cập nhật hồ sơ</a></li>
								<li>
									<hr class="dropdown-divider-black">
								</li>
								<li><a class="dropdown-item" href="#"><i
										class="fa-solid fa-store"></i> Đơn hàng</a></li>
								<li><a class="dropdown-item" href="#"><i
										class="fa-solid fa-cart-arrow-down"></i> Hàng đã mua</a></li>
							</ul></li>
					</ul>
					<span class="navbar-text"> English </span> <span
						class="navbar-text" style="margin-left: 30px;"> Vietnamese
					</span>
				</div>
			</div>
		</nav>
	</nav>
</body>
</html>